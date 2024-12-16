package trabalhos;

import java.util.Random;

public class T4 {

    // **Bubble Sort**
    // Este algoritmo percorre o array várias vezes, comparando pares de elementos consecutivos
    // e trocando-os se estiverem fora de ordem. Após cada iteração, o maior elemento "sobe" para a posição final.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // **Insertion Sort**
    // Este algoritmo constrói o array ordenado inserindo elementos, um de cada vez, na posição correta.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int chave = arr[i]; // Elemento atual a ser inserido
            int j = i - 1;
            // Move os elementos maiores que a chave uma posição para frente
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave; // Insere a chave na posição correta
        }
    }

    // **Selection Sort**
    // O algoritmo seleciona o menor elemento e o coloca na posição correta, repetindo até o array estar ordenado.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i; // Índice do menor elemento
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Troca o menor elemento com o elemento atual
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }

    // **Merge Sort**
    // Este algoritmo divide o array em duas metades, ordena cada metade recursivamente e as combina (merge).
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; // Caso base: array de tamanho 1 já está ordenado

        int meio = arr.length / 2;
        int[] esquerda = new int[meio]; // Cria o subarray esquerdo
        int[] direita = new int[arr.length - meio]; // Cria o subarray direito

        for (int i = 0; i < meio; i++) {
            esquerda[i] = arr[i];
        }
        for (int i = meio; i < arr.length; i++) {
            direita[i - meio] = arr[i];
        }

        mergeSort(esquerda); // Ordena recursivamente a metade esquerda
        mergeSort(direita); // Ordena recursivamente a metade direita

        mesclar(arr, esquerda, direita); // Combina as duas metades ordenadas
    }

    // Função auxiliar para mesclar dois arrays ordenados em um único array
    private static void mesclar(int[] arr, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                arr[k++] = esquerda[i++]; // Copia o menor elemento para o array principal
            } else {
                arr[k++] = direita[j++];
            }
        }
        while (i < esquerda.length) {
            arr[k++] = esquerda[i++]; // Copia os elementos restantes do array esquerdo
        }
        while (j < direita.length) {
            arr[k++] = direita[j++]; // Copia os elementos restantes do array direito
        }
    }

    // **Quick Sort**
    // Algoritmo que divide o array em torno de um pivô e ordena recursivamente as subpartes.
    public static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto); // Particiona o array e obtém o índice do pivô

            quickSort(arr, baixo, pi - 1); // Ordena a parte à esquerda do pivô
            quickSort(arr, pi + 1, alto); // Ordena a parte à direita do pivô
        }
    }

    // Função auxiliar para particionar o array
    private static int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto]; // O último elemento é escolhido como pivô
        int i = (baixo - 1); // Índice do menor elemento

        for (int j = baixo; j < alto; j++) {
            if (arr[j] <= pivo) { // Se o elemento atual é menor ou igual ao pivô
                i++;
                // Troca o elemento em i com o elemento em j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Troca o pivô com o elemento na posição i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1; // Retorna o índice do pivô
    }

    // **Radix Sort**
    // Algoritmo baseado em dígitos que ordena os elementos por posições de menor significância para maior.
    public static void radixSort(int[] arr) {
        int max = findMax(arr); // Encontra o maior número para determinar o número de dígitos

        // Ordena por cada dígito, começando pelo menos significativo
        for (int exp = 1; max / exp > 0; exp *= 10) {
            ordenarPorDigito(arr, exp);
        }
    }

    // Função para encontrar o maior elemento no array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Função auxiliar para ordenar os números por um dígito específico (exp)
    private static void ordenarPorDigito(int[] arr, int exp) {
        int n = arr.length;
        int[] saida = new int[n]; // Array para armazenar a saída temporária
        int[] contagem = new int[10]; // Frequência dos dígitos (0-9)

        // Conta a frequência de cada dígito no lugar atual (exp)
        for (int i = 0; i < n; i++) {
            int digito = (arr[i] / exp) % 10;
            contagem[digito]++;
        }

        // Atualiza a contagem para refletir as posições reais
        for (int i = 1; i < 10; i++) {
            contagem[i] += contagem[i - 1];
        }

        // Constrói o array de saída ordenado pelo dígito atual
        for (int i = n - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            saida[contagem[digito] - 1] = arr[i];
            contagem[digito]--;
        }

        // Copia os elementos ordenados de volta para o array original
        for (int i = 0; i < n; i++) {
            arr[i] = saida[i];
        }
    }

    // **Main**
    public static void trab() {
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000, 10000000};
        Random random = new Random();

        System.out.println("BUBBLE SORT:");
        for (int tamanho : tamanhos) {
            int[] vetorOriginal = random.ints(tamanho, 1, 1000000).toArray();
            System.out.println("Tamanho " + tamanho + ":");

            // Bubble Sort
            int[] vetor = vetorOriginal.clone();
            long inicio = System.nanoTime();
            bubbleSort(vetor);
            long tempoBubble = System.nanoTime() - inicio;
            System.out.println("Bubble Sort: " + (tempoBubble / 1e9) + " segundos");

            // Insertion Sort
            vetor = vetorOriginal.clone();
            inicio = System.nanoTime();
            insertionSort(vetor);
            long tempoInsertion = System.nanoTime() - inicio;
            System.out.println("Insertion Sort: " + (tempoInsertion / 1e9) + " segundos");

            // Selection Sort
            vetor = vetorOriginal.clone();
            inicio = System.nanoTime();
            selectionSort(vetor);
            long tempoSelection = System.nanoTime() - inicio;
            System.out.println("Selection Sort: " + (tempoSelection / 1e9) + " segundos");

            // Merge Sort
            vetor = vetorOriginal.clone();
            inicio = System.nanoTime();
            mergeSort(vetor);
            long tempoMerge = System.nanoTime() - inicio;
            System.out.println("Merge Sort: " + (tempoMerge / 1e9) + " segundos");

            // Quick Sort
            vetor = vetorOriginal.clone();
            inicio = System.nanoTime();
            quickSort(vetor, 0, vetor.length - 1);
            long tempoQuick = System.nanoTime() - inicio;
            System.out.println("Quick Sort: " + (tempoQuick / 1e9) + " segundos");

            // Radix Sort
            vetor = vetorOriginal.clone();
            inicio = System.nanoTime();
            radixSort(vetor);
            long tempoRadix = System.nanoTime() - inicio;
            System.out.println("Radix Sort: " + (tempoRadix / 1e9) + " segundos");

            System.out.println(); // Linha em branco entre os tamanhos
        }
    }
    //O termo 1e9 no println é uma notação científica em Java que representa 10^9(1 bilhão). Ele é usado aqui para converter o tempo em nanosegundos (a unidade retornada por System.nanoTime()) para segundos.
    // Execução do método
}
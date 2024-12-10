package trabalhos;

import java.util.Arrays;
import java.util.Random;

public class AlgoritmosDeOrdenacao {

    // **Bubble Sort**
    // Algoritmo simples que compara pares de elementos adjacentes no array,
    // trocando-os se estiverem na ordem errada. Repete o processo até que
    // o array esteja ordenado.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // **Insertion Sort**
    // Algoritmo que constrói o array final ordenado um elemento por vez,
    // movendo os elementos maiores para a frente.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;

            // Move elementos maiores que a chave para frente
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    // **Selection Sort**
    // Algoritmo que seleciona o menor elemento do array a cada iteração
    // e o posiciona na posição correta.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Troca
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }

    // **Merge Sort**
    // Algoritmo de ordenação recursivo que divide o array em duas partes,
    // ordena ambas recursivamente e depois mescla as duas partes ordenadas.
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int meio = arr.length / 2;

        int[] esquerda = Arrays.copyOfRange(arr, 0, meio);
        int[] direita = Arrays.copyOfRange(arr, meio, arr.length);

        mergeSort(esquerda);
        mergeSort(direita);

        mesclar(arr, esquerda, direita);
    }

    // Mescla dois subarrays ordenados em um único array ordenado.
    private static void mesclar(int[] arr, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                arr[k++] = esquerda[i++];
            } else {
                arr[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) arr[k++] = esquerda[i++];
        while (j < direita.length) arr[k++] = direita[j++];
    }

    // **Quick Sort**
    // Algoritmo que seleciona um pivô, particiona os elementos em relação ao pivô
    // (menores à esquerda e maiores à direita) e ordena as partições recursivamente.
    public static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);

            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    // Particiona o array em relação ao pivô.
    private static int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (arr[j] <= pivo) {
                i++;
                // Troca
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca o pivô
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    // **Radix Sort**
    // Algoritmo que ordena números processando dígito por dígito,
    // do menos significativo ao mais significativo, usando Counting Sort como subrotina.
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            ordenarPorDigito(arr, exp);
        }
    }

    // Ordena os números de acordo com um dígito específico.
    private static void ordenarPorDigito(int[] arr, int exp) {
        int n = arr.length;
        int[] saida = new int[n];
        int[] contagem = new int[10];

        // Contagem
        for (int i = 0; i < n; i++) {
            int digito = (arr[i] / exp) % 10;
            contagem[digito]++;
        }

        // Soma cumulativa
        for (int i = 1; i < 10; i++) {
            contagem[i] += contagem[i - 1];
        }

        // Construção do array de saída
        for (int i = n - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            saida[contagem[digito] - 1] = arr[i];
            contagem[digito]--;
        }

        // Copiar para o array original
        System.arraycopy(saida, 0, arr, 0, n);
    }

    // **Main**
    // Executa os algoritmos de ordenação com diferentes tamanhos de vetores
    // e mede os tempos de execução de cada um.
    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000}; // Tamanhos dos vetores
        Random random = new Random();

        System.out.println("Tamanho,Bubble Sort,Insertion Sort,Selection Sort,Merge Sort,Quick Sort,Radix Sort");

        for (int tamanho : tamanhos) {
            int[] vetorOriginal = random.ints(tamanho, 1, 1000000).toArray(); // Vetor aleatório
            System.out.print(tamanho + ",");

            // Bubble Sort
            int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            long inicio = System.nanoTime();
            bubbleSort(vetor);
            long tempoBubble = System.nanoTime() - inicio;
            System.out.print(tempoBubble + ",");

            // Insertion Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            insertionSort(vetor);
            long tempoInsertion = System.nanoTime() - inicio;
            System.out.print(tempoInsertion + ",");

            // Selection Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            selectionSort(vetor);
            long tempoSelection = System.nanoTime() - inicio;
            System.out.print(tempoSelection + ",");

            // Merge Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            mergeSort(vetor);
            long tempoMerge = System.nanoTime() - inicio;
            System.out.print(tempoMerge + ",");

            // Quick Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            quickSort(vetor, 0, vetor.length - 1);
            long tempoQuick = System.nanoTime() - inicio;
            System.out.print(tempoQuick + ",");

            // Radix Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            radixSort(vetor);
            long tempoRadix = System.nanoTime() - inicio;
            System.out.println(tempoRadix);
        }
    }
}

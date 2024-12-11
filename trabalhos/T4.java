package trabalhos;

import java.util.Arrays;
import java.util.Random;

public class T4 {

    // **Bubble Sort**
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
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    // **Selection Sort**
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }

    // **Merge Sort**
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int meio = arr.length / 2;
        int[] esquerda = Arrays.copyOfRange(arr, 0, meio);
        int[] direita = Arrays.copyOfRange(arr, meio, arr.length);
        mergeSort(esquerda);
        mergeSort(direita);
        mesclar(arr, esquerda, direita);
    }

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
    public static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);
            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private static int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto];
        int i = (baixo - 1);
        for (int j = baixo; j < alto; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;
        return i + 1;
    }

    // **Radix Sort**
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            ordenarPorDigito(arr, exp);
        }
    }

    private static void ordenarPorDigito(int[] arr, int exp) {
        int n = arr.length;
        int[] saida = new int[n];
        int[] contagem = new int[10];
        for (int i = 0; i < n; i++) {
            int digito = (arr[i] / exp) % 10;
            contagem[digito]++;
        }
        for (int i = 1; i < 10; i++) {
            contagem[i] += contagem[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int digito = (arr[i] / exp) % 10;
            saida[contagem[digito] - 1] = arr[i];
            contagem[digito]--;
        }
        System.arraycopy(saida, 0, arr, 0, n);
    }

    // **Main**
    public static void trab() {
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000, 10000000};
        Random random = new Random();

        System.out.println("BUBBLE SORT:");
        for (int tamanho : tamanhos) {
            int[] vetorOriginal = random.ints(tamanho, 1, 1000000).toArray();
            System.out.printf("Tamanho %d:\n", tamanho);

            // Bubble Sort
            int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            long inicio = System.nanoTime();
            bubbleSort(vetor);
            long tempoBubble = System.nanoTime() - inicio;
            System.out.printf("Bubble Sort: %.6f segundos\n", tempoBubble / 1e9);

            // Insertion Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            insertionSort(vetor);
            long tempoInsertion = System.nanoTime() - inicio;
            System.out.printf("Insertion Sort: %.6f segundos\n", tempoInsertion / 1e9);

            // Selection Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            selectionSort(vetor);
            long tempoSelection = System.nanoTime() - inicio;
            System.out.printf("Selection Sort: %.6f segundos\n", tempoSelection / 1e9);

            // Merge Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            mergeSort(vetor);
            long tempoMerge = System.nanoTime() - inicio;
            System.out.printf("Merge Sort: %.6f segundos\n", tempoMerge / 1e9);

            // Quick Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            quickSort(vetor, 0, vetor.length - 1);
            long tempoQuick = System.nanoTime() - inicio;
            System.out.printf("Quick Sort: %.6f segundos\n", tempoQuick / 1e9);

            // Radix Sort
            vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
            inicio = System.nanoTime();
            radixSort(vetor);
            long tempoRadix = System.nanoTime() - inicio;
            System.out.printf("Radix Sort: %.6f segundos\n", tempoRadix / 1e9);

            System.out.println();  // Linha em branco entre os tamanhos
        }
    }

    // Execução do método
}


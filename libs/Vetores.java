
package libs;
import java.util.Arrays;
import java.util.Random;

public class Vetores {
    public static int[] alocarInteiro(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static float[] alocarReais(int n) {
        float[] vetor = new float[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = 0;

        }
        return vetor;
    }

    public static boolean[] alocarLogicos(int n) {
        boolean[] vetor = new boolean[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = false;
        }
        return vetor;
    }

    public static char[] alocarCaracteres(int n) {
        char[] vetor = new char[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = '\0';
        }
        return vetor;
    }

    public static String[] alocarCadeiasDeCaracteres(int n) {
        String[] vetor = new String[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = "";
        }
        return vetor;
    }

    public static int[] subVetor(int[] v, int a, int b) {
        int[] subvetor = new int[b - a];
        for (int i = a; i < b; i++) {
            subvetor[i - a] = v[i];
        }
        return subvetor;
    }

    public static int[] copiarVetor(int[] v) {
        int[] copia = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            copia[i] = v[i];
        }
        return copia;
    }

    public static int[] lerInteiros(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerInt();
        }
        return vetor;
    }

    public static float[] lerReais(int n) {
        float[] vetor = new float[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerFloat();
        }
        return vetor;
    }

    public static char[] lerCaracteres(int n) {
        char[] vetor = new char[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerChar();
        }
        return vetor;
    }

    public static String[] lerStrings(int n) {
        String[] vetor = new String[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerString();
        }
        return vetor;
    }

    public static int obterPosicaoInteiro(int[] vetor, int valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        return -1;

    }

    public static int obterPosicaoReal(float[] vetor, float valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoLogico(boolean[] vetor, boolean valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoCaractere(char[] vetor, char valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        return -1;
    }

    public static int obterPosicaoCadeiaDeCaracteres(String[] vetor, String valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i].equals(valor_buscar)) {
                return i;
            }
        }
        return -1;
    }
                                                                                                                                                                       //Desenvolva uma função chamada obterIndices, que recebe como parâmetros um vetor de inteiros v e um valor inteiro valor_buscar. A função deve retornar um vetor de inteiros contendo os índices em que o valor valor_buscar aparece no vetor v.

    public static int[] obterIndices(int[] v, int valor_buscar) {
        int[] indices = new int[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                int[] novoIndices = new int[indices.length + 1];
                
               }
        }
        return indices;
    }
    public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
        
        return vetor;
    }
    public static int BuscaSequencial(int[] v, int x) {
        int i;
        for (i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int buscaBinaria(int[] vetor, int valor_buscar){
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor_buscar) {
                return meio;
            } else if (vetor[meio] < valor_buscar) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        //Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }


}



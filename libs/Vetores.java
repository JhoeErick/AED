
package libs;
import libs.Matematica;
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

    public static int buscaBinaria(int[] vetor, int valor_buscar) {
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

    
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);


        Arrays.sort(vetor);

        return vetor;
    }

    public static void trocar(int[] v, int i, int j) {
        int tmp;
        tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;

    }

    public static void ordenarInsertionSort(int[] v) {
        int i, j;
        for (i = 1; i < v.length; i++) {
            j = i;
            while (j > 0 && v[j] < v[j - 1]) {
                trocar(v, j, j - 1);
                j--;
            }
        }
    }

    public static void ordenarSelectionSort(int[] v) {
        int i, j, menor_val, menor_pos;
        for (i = 0; i < v.length - 1; i++) {
            menor_val = v[i];
            menor_pos = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }
            trocar(v, i, menor_pos);
        }
    }

    public static int[] countingSort(int[] v) {
        int[] contadores = new int[10];
        int[] contadores_acumulado = new int[10];
        int[] resultado = new int[v.length];

        int i;
        for (i = 0; i < v.length; i++) {
            contadores[v[i]]++;
        }
        for (i = 1; i < contadores.length; i++) {
            contadores_acumulado[i] = contadores[i - 1] + contadores_acumulado[i - 1];
        }
        for (i = 0; i < v.length; i++) {
            resultado[contadores_acumulado[v[i]]] = v[i];
            contadores_acumulado[v[i]]++;

        }
        return resultado;
    }
    public static int[] countingSort(int []v, int k){
        int[] contadores = new int[10];
        int[] contadores_acumulado = new int[10];
        int[] resultado = new int[v.length];

        int i, p;

        for(i=1; i<v.length; i++){
           p = Vetores.obterValorPos(v[i], k);
           contadores[p]++;
        }
        for(i=1; i<contadores.length; i++){
            contadores_acumulado[i] = contadores[i-1] + contadores_acumulado[i-1];
        }
        for(i=0; 1<v.length; i++){
            p = Vetores.obterValorPos(v[i], k);
            resultado[contadores_acumulado[p]++] = v[i];
        }
        return resultado;
    }

    public static void mostrarVetor(int[] v) {
        int i;
        System.out.print("[");
        for (i = 0; i < v.length - 1; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("]");

    }

    public static int obterValorPos(int x, int k){
            return(x%Matematica.potencia(10, k)/Matematica.potencia(10, k-1));
        
        }
    public static int[] radixSort(int [] v){
        int maior_valor = Vetores.maior(v);
        int k = 1, i;
        while (maior_valor > Matematica.potencia(10, k)) {
            k++;
        }
        System.out.println("k= "+ k);
        for(i=1; i<=4; i++){
            v = countingSort(v,k);
        }
        return v;
        }
        public static int maior(int[] v){
            int maior_valor = v[0];
            for(int i=1; i<v.length; i++){
                if(v[i] > maior_valor){
                    maior_valor = v[i];
                }
            }
            return maior_valor;
        }

}

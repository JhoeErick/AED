package aulas;

import libs.saida;
import libs.Vetores;

public class aula27 {
    public static void aula() {
      int[]a=Vetores.alocarInteiro(3);
      a[3]=3;
        
    saida.mostrarVetor(obterIndices(a,3),'0');
    }

    public static int obterPosicao(int[] vetor, int valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        ;
        return -1;

    }

    public static int obterPosicao(boolean[] vetor, boolean valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        ;
        return -1;

    }

    public static int obterPosicao(char[] vetor, char valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        ;
        return -1;

    }

    public static int obterPosicao(float[] vetor, float valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                return i;
            }
        }
        ;
        return -1;

    }

    public static int obterPosicao(String[] vetor, String valor_buscar, int pos_inicial) {
        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i].equals(valor_buscar)) {
                return i;
            }
        }  
        ;
        return -1;

    }

    public static int[] obterIndices(int[] v, int valor_buscar){
        int [] indices;
        int contador = 0;
        for(int i=0;i< v.length;i++){
            if (v[i]== valor_buscar) {
                contador++;
                
            }
        }
        indices= new int[contador];
        for(int j=0;j<=contador;j++){
            indices[j-1]=obterPosicao(v, valor_buscar, j);
        }
return indices;
    }
}
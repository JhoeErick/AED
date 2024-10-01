package libs;

import libs.Entrada;

public class Matrizes {
    public static int[][] somar(int[][] mA, int[][] mB) {
        int i, j;
        int[][] mC;
        mC = new int[mA.length][mB.length];

        for (i = 0; i < mA.length; i++) {
            for (j = 0; j < mA[i].length; j++) {
            }
        }
        return mC;
    }

    public static int[][] novaIdentidade(int n) {
        int[][] mI = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    mI[i][j] = 1;
                } else {
                    mI[i][j] = 0;
                }
            }
        }
        return mI;

    }

    public static void mostrar(int[][] m) {
        int i, j;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static boolean comparador(int[][] mA, int[][] mB) {
        if (mA.length != mB.length || mA[0].length != mB[0].length)
            return false;
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                if (mA[i][j] != mB[i][j])
                    return false;
            }
        }
        return true;
    }

    public static int[][] alocarInteiros(int n_linhas, int n_colunas) {
        int[][] m = new int[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                m[i][j] = 0;
            }
        }
        return m;
    }

    public static float[][] matrizNovaFloat(int n_linhas, int n_colunas) {
        float[][] m = new float[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                m[i][j] = 0.0f;
            }
        }
        return m;
    }

    public static boolean[][] matrizNovaBool(int n_linhas, int n_colunas) {
        boolean[][] m = new boolean[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                m[i][j] = false;
            }
        }
        return m;
    }

    // De maneira semelhante desenvolva a função matrizNovaString, que retorna uma
    // matriz com valores do tipo caractere. A matriz retornada deve ter seus
    // elementos preenchidos com "" (sequência de caracteres vazia).
    public static String[][] matrizNovaString(int n_linhas, int n_colunas) {
        String[][] m = new String[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                m[i][j] = "";
            }
        }
        return m;
    }

    public static void matrizPrintInt(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizPrintFloat(float[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizPrintString(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizPreencherInt(int[][] m, int valor) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = valor;
            }
        }
        return m;
    }

    public static float[][] matrizPreencherFloat(float[][] m, float valor) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = valor;
            }
        }
        return m;
    }

    public static boolean[][] matrizPreencherBool(boolean[][] m, boolean valor) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = valor;
            }
        }
        return m;
    }

    public static int[][] matrizLeiaInt(int[][] m) {
        Entrada.abrir();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Entrada.lerInt();
                Entrada.fechar();
            }
        }
        return m;
    }

    // Desenvolva também as funções matrizLeiaFloat e matrizLeiaString.
    public static String[][] matrizLeia(String[][] m) {
        Entrada.abrir();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Entrada.lerString();
                Entrada.fechar();
            }
        }
        return m;
    }

    public static float[][] matrizLeiaFloat(float[][] m) {
        Entrada.abrir();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Entrada.lerFloat();
                Entrada.fechar();
            }
        }
        return m;
    }

    public static int[][] matrizBuscaInt(int[][] m, int x) {
        int[][] posicoes = new int[100][2];
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == x) {
                    posicoes[count][0] = i;
                    posicoes[count][1] = j;
                    count++;
                }
            }
        }
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = posicoes[i][0];
            result[i][1] = posicoes[i][1];
        }
        return result;
    }

    public static float[][] matrizBuscaFloat(float[][] m, float x) {
        int[][] posicoes = new int[100][2];
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == x) {
                    posicoes[count][0] = i;
                    posicoes[count][1] = j;
                    count++;
                }
            }
        }
        float[][] result = new float[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = posicoes[i][0];
            result[i][1] = posicoes[i][1];
        }
        return result;
    }

    public static String[][] matrizBuscaString(String[][] m, String x) {
        int[][] posicoes = new int[100][2];
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].equals(x)) {
                    posicoes[count][0] = i;
                    posicoes[count][1] = j;
                    count++;
                }
            }
        }
        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = Integer.toString(posicoes[i][0]);
            result[i][1] = Integer.toString(posicoes[i][1]);
        }
        return result;
    }

    public static int[] matrizGetLinhaInt(int[][] A, int i) {
        int[] result = new int[A[i].length];
        for (int j = 0; j < A[i].length; j++) {
            result[j] = A[i][j];
        }
        return result;
    }

    public static float[] matrizGetLinhaFloat(float[][] A, int i) {
        float[] result = new float[A[i].length];
        for (int j = 0; j < A[i].length; j++) {
            result[j] = A[i][j];
        }
        return result;
    }

    public static boolean[] matrizGetLinhaBool(boolean[][] A, int i) {
        boolean[] result = new boolean[A[i].length];
        for (int j = 0; j < A[i].length; j++) {
            result[j] = A[i][j];
        }
        return result;
    }

    public static int[] matrizGetColunaInt(int[][] A, int i) {
        int[] result = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            result[j] = A[j][i];
        }
        return result;
    }

    public static float[] matrizGetColunaFloat(float[][] A, int i) {
        float[] result = new float[A.length];
        for (int j = 0; j < A.length; j++) {
            result[j] = A[j][i];
        }
        return result;

    }

    public static boolean[] matrizGetColunaBool(boolean[][] A, int i) {
        boolean[] result = new boolean[A.length];
        for (int j = 0; j < A.length; j++) {
            result[j] = A[j][i];
        }
        return result;
    }

    public static String[] matrizGetColunaStr(String[][] A, int i) {
        String[] result = new String[A.length];
        for (int j = 0; j < A.length; j++) {
            result[j] = A[j][i];
        }
        return result;
    }

   
   

}
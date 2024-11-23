package trabalhos;



public class T3 {
    public static void mostrarInteiros(int[] vetor, char sep) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(sep);
            }
        }
        System.err.println("\n---------");
    }

    public static int[] filtrarMaiores(int[] vetor, int x) {
        // Contar quantos elementos são maiores que x
        int contador = 0;
        for (int num : vetor) { 
                               
        if (num > x) {
                contador++;
            }
        }

        // Criar um novo vetor para armazenar os elementos maiores que x
        int[] maiores = new int[contador];
        int index = 0;
        for (int num : vetor) {
            if (num > x) {
                maiores[index++] = num;
            }
        }

        return maiores;
    }

    public static int[] filtrarMenores(int[] vetor, int x) {
        // Contar quantos elementos são menores que x
        int contador = 0;
        for (int num : vetor) {
            if (num < x) {
                contador++;
            }
        }

        // Criar um novo vetor para armazenar os elementos menores que x
        int[] menores = new int[contador];
        int index = 0;
        for (int num : vetor) {
            if (num < x) {
                menores[index++] = num;
            }
        }

        return menores;
    }

    public static boolean[] aplicarELogico(boolean[] va, boolean[] vb) {
        // Determina o tamanho do menor vetor
        int tamanho = Math.min(va.length, vb.length);
        boolean[] resultado = new boolean[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = va[i] && vb[i];
        }

        return resultado;
    }

    public static boolean[] aplicarOuLogico(boolean[] va, boolean[] vb) {
        // Determina o tamanho do menor vetor
        int tamanho = Math.min(va.length, vb.length);
        boolean[] resultado = new boolean[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = va[i] || vb[i];
        }

        return resultado;
    }

    public static int[] aplicarMascara(int[] valores, boolean[] mascara) {
        // Determina o tamanho do menor vetor para evitar erros
        int tamanho = Math.min(valores.length, mascara.length);
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (mascara[i]) {
                contador++;
            }
        }
        int[] resultado = new int[contador];
        int index = 0;

        // Adiciona os valores que correspondem a `true` na máscara
        for (int i = 0; i < tamanho; i++) {
            if (mascara[i]) {
                resultado[index++] = valores[i];
            }
        }

        return resultado;
    }
    




   

    public static int[] diferenca(int[] array1, int[] array2) {
        // O tamanho máximo possível da diferença é o tamanho do primeiro array
        int[] temp = new int[array1.length];
        int tamanho = 0;

        for (int num : array1) {
            if (!existeNoArray(array2, num) && !contidoDif(temp, tamanho, num)) {
                temp[tamanho] = num;
                tamanho++;
            }
        }

        // Cria o array final com o tamanho exato
        int[] resultado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = temp[i];
        }

        return resultado;
    }

    public static void mostrarVetor(boolean[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void mostrarVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    private static boolean existeNoArray(int[] array, int valor) {
        for (int num : array) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    private static boolean contidoInter(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    
    private static boolean contidoDif(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

}

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
    public static int[] uniao(int[] a, int[] b) {
        // Determinar o tamanho máximo possível do vetor resultante
        int[] temp = new int[a.length + b.length];
        int tamanho = 0;
    
        // Adicionar elementos do vetor 'a', garantindo que não há duplicatas
        for (int i = 0; i < a.length; i++) {
            if (!existeNoVetor(temp, tamanho, a[i])) {
                temp[tamanho] = a[i];
                tamanho++;
            }
        }
    
        // Adicionar elementos do vetor 'b', garantindo que não há duplicatas
        for (int i = 0; i < b.length; i++) {
            if (!existeNoVetor(temp, tamanho, b[i])) {
                temp[tamanho] = b[i];
                tamanho++;
            }
        }
    
        // Criar o vetor final com o tamanho exato
        int[] resultado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = temp[i];
        }
    
        return resultado;
    }
    public static int[] intersecao(int[] a, int[] b) {
        // Determinar o tamanho máximo possível do vetor resultante
        int[] temp = new int[Math.min(a.length, b.length)];
        int tamanho = 0;
    
        // Verificar elementos de 'a' que também estão em 'b'
        for (int i = 0; i < a.length; i++) {
            if (!existeNoVetor(temp, tamanho, a[i]) && existeNoVetor(b, b.length, a[i])) {
                temp[tamanho] = a[i];
                tamanho++;
            }
        }
    
        // Criar o vetor final com o tamanho exato
        int[] resultado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = temp[i];
        }
    
        return resultado;
    }
    public static int[] diferenca(int[] a, int[] b) {
        // Vetor temporário para armazenar os elementos únicos da diferença
        int[] temp = new int[a.length];
        int tamanho = 0;
    
        // Verificar elementos de 'a' que não estão em 'b'
        for (int i = 0; i < a.length; i++) {
            if (!existeNoVetor(temp, tamanho, a[i]) && !existeNoVetor(b, b.length, a[i])) {
                temp[tamanho] = a[i];
                tamanho++;
            }
        }
    
        // Criar o vetor final com o tamanho exato
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


    public static boolean contidoInter(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean contidoDif(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
    public static boolean existeNoVetor(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
    public static boolean existeNoVetor(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}


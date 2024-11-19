package Trabalhos;
import libs.Entrada;
public class T3 {
    public static void mostrarInteiros(int[] vetor, char sep) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(sep);
            }
        }
        System.out.println(); 
    }
    public static int[] filtrarMaiores(int[] vetor, int x) {
        // Contar quantos elementos são maiores que x
        int count = 0;
        for (int num : vetor) { //"Para cada elemento do array vetor, atribua o valor à variável num e execute o bloco de código."


            if (num > x) {
                count++;
            }
        }

        // Criar um novo vetor para armazenar os elementos maiores que x
        int[] maiores = new int[count];
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
            int count = 0;
            for (int num : vetor) {
                if (num < x) {
                    count++;
                }
            }
    
            // Criar um novo vetor para armazenar os elementos menores que x
            int[] menores = new int[count];
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
    
            // Cria um novo vetor para armazenar os resultados
            boolean[] resultado = new boolean[tamanho];
    
            // Aplica o operador lógico AND elemento a elemento
            for (int i = 0; i < tamanho; i++) {
                resultado[i] = va[i] && vb[i];
            }
    
            return resultado;
        }
        public static boolean[] aplicarOuLogico(boolean[] va, boolean[] vb) {
            // Determina o tamanho do menor vetor
            int tamanho = Math.min(va.length, vb.length);
    
            // Cria um novo vetor para armazenar os resultados
            boolean[] resultado = new boolean[tamanho];
    
            // Aplica o operador lógico OR elemento a elemento
            for (int i = 0; i < tamanho; i++) {
                resultado[i] = va[i] || vb[i];
            }
    
            return resultado;
        }
        public static int[] aplicarMascara(int[] valores, boolean[] mascara) {
            // Determina o tamanho do menor vetor para evitar erros
            int tamanho = Math.min(valores.length, mascara.length);
    
            // Conta quantos valores serão incluídos no resultado
            int count = 0;
            for (int i = 0; i < tamanho; i++) {
                if (mascara[i]) {
                    count++;
                }
            }
    
            // Cria um novo vetor para armazenar os resultados filtrados
            int[] resultado = new int[count];
            int index = 0;
    
            // Adiciona os valores que correspondem a `true` na máscara
            for (int i = 0; i < tamanho; i++) {
                if (mascara[i]) {
                    resultado[index++] = valores[i];
                }
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
}

package Trabalhos;

import libs.Entrada;

public class T3 {
    public static void EX1() {
        System.out.println("--Trabalho 3 Bim - Exercicio 1--");
        Entrada.abrir();
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        char separador = Entrada.lerChar("Qual tipo de separador você deseja?");
        mostrarInteiros(vetor, separador);
        Entrada.fechar();
    }

    public static void mostrarInteiros(int[] vetor, char separador) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
        System.out.println();

    }

    public static void EX2() {
        System.out.println("--Trabalho 3 Bim - Exercicio 2--");
        Entrada.abrir();
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int valor = Entrada.lerInt("Qual valor deseja filtrar?");
        filtrarMaiores(vetor, valor);
        Entrada.fechar();
    }

    public static void filtrarMaiores(int[] vetor, int valor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                contador++;
            }
        }
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                resultado[indice] = vetor[i];
                indice++;
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();

    }

    public static void EX3() {
        System.out.println("--Trabalho 3 Bim - Exercicio 2--");
        Entrada.abrir();
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int valor = Entrada.lerInt("Qual valor deseja filtrar?");
        filtrarMaiores(vetor, valor);
        Entrada.fechar();
    }

    public static void filtrarMenores(int[] vetor, int valor) {
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < valor) {
                contador++;
            }
        }
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < valor) {
                resultado[indice] = vetor[i];
                indice++;
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }

    public static void EX4() {
        System.out.println("--Trabalho 3 Bim - Exercicio 4--");
        Entrada.abrir();
        boolean[] v = { true, false, true, false, true };
        boolean[] w = { false, true, false, true, false };
        boolean[] resultado = aplicarELogico(v, w);
        mostrarVetorLogicoE(resultado);
        Entrada.fechar();
        System.out.println();
    }

    public static boolean[] aplicarELogico(boolean[] v, boolean[] w) {
        boolean[] resultado = new boolean[v.length];
        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i] && w[i];
        }
        return resultado;
    }

    public static void mostrarVetorLogicoE(boolean[] v) {
        for (boolean b : v) {
            System.out.print(b + " ");
        }
    }

    public static void EX5() {
        System.out.println("--Trabalho 3 Bim - Exercicio 5--");
        Entrada.abrir();
        boolean[] v = { true, false, true, false, true };
        boolean[] w = { false, true, false, true, false };
        boolean[] resultado = aplicarOuLogico(v, w);
        mostrarVetorLogicoOU(resultado);
        Entrada.fechar();
        System.out.println();
    }

    public static boolean[] aplicarOuLogico(boolean[] v, boolean[] w) {
        boolean[] resultado = new boolean[v.length];
        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i] || w[i];
        }
        return resultado;
    }

    public static void mostrarVetorLogicoOU(boolean[] v) {
        for (boolean b : v) {
            System.out.print(b + " ");
        }
    }
    public static void EX6() {
        System.out.println("--Trabalho 3 Bim - Exercicio 6--");
        Entrada.abrir();
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean[] mascara = {true, false, true, false, true, false, false, false, false, true};
        int[] resultado = aplicarMascara(v, mascara);
        mostrarVetor(resultado);
        Entrada.fechar();
        System.out.println();
    }
    
    public static int[] aplicarMascara(int[] v, boolean[] mascara) {
        int contador = 0;
        for (boolean m : mascara) {
            if (m) {
                contador++;
            }
        }
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < mascara.length; i++) {
            if (mascara[i]) {
                resultado[indice] = v[i];
                indice++;
            }
        }
        return resultado; 
    }
    public static void mostrarVetor(int[] v) {
        for (int b : v) {
            System.out.print(b + " ");
        }
    }
    public static void EX7() {
        System.out.println("--Trabalho 3 Bim - Exercicio 7--");
        Entrada.abrir();
        int[] v1 = {1, 2, 3, 4};
        int[] v2 = {6, 7, 8, 9};
        int[] resultado = uniaoVetores(v1, v2);
        mostrarVetor(resultado);
        Entrada.fechar();
        System.out.println();
}

   


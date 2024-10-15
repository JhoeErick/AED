//Desenvolva um procedimento chamado mostrarInteiros que recebe como entrada um vetor com elementos do tipo inteiro e um caractere separador e mostra esses valores na tela, todos em uma única linha. Cada elemento deve ser separado pelo caractere separador.

package Trabalhos;

import libs.Entrada;

public class T3 {
public static void EX1() {
        System.out.println("--Trabalho 3 Bim - Exercicio 1--");
        Entrada.abrir();
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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
public static void EX2(){
    System.out.println("--Trabalho 3 Bim - Exercicio 2--");
        Entrada.abrir();
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = Entrada.lerInt("Qual valor deseja filtrar?");
        filtrarMaiores(vetor, valor);
        Entrada.fechar();
    }
public static void filtrarMaiores(int []vetor, int valor){
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > valor){
                contador++;
            }
        }
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > valor){
                resultado[indice] = vetor[i];
                indice++;
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.print( resultado[i] + " ");
        }
        System.out.println();

    }
    public static void EX3(){
        System.out.println("--Trabalho 3 Bim - Exercicio 2--");
            Entrada.abrir();
            int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int valor = Entrada.lerInt("Qual valor deseja filtrar?");
            filtrarMaiores(vetor, valor);
            Entrada.fechar();
        }
    public static void filtrarMenores(int []vetor, int valor){
            int contador = 0;
            for (int i = 0; i > vetor.length; i--) {
                if(vetor[i] > valor){
                    contador++;
                }
            }
            int[] resultado = new int[contador];
            int indice = 0;
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] > valor){
                    resultado[indice] = vetor[i];
                    indice++;
                }
            }
            for (int i = 0; i < resultado.length; i++) {
                System.out.print( resultado[i] + " ");
            }
            System.out.println();
    
        }
}
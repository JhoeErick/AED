package aulas;

import libs.*;

public class aula24 {

    public static void aula() {
        System.out.println("Aula do dia 10/09 - Vetores");
        // mediaNumeros();
        // vetorVC();
        // trocaNumeroNegativo();
    }

    public static void mediaNumeros() {
        int a[];
        a = new int[8];
        float media;
        int soma;
        int quantidadeAcima = 0;
        Entrada.abrir();
        for (int j = 0; j < 8; j++) {
            a[j] = Entrada.lerInt();
        }
        Entrada.fechar();
        soma = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7];
        media = (float) soma / 8;
        for (int i = 0; i < 8; i++) {
            if (a[i] > media) {
                quantidadeAcima++;

            }
        }
        System.out.println(quantidadeAcima);
    }

    public static void vetorVC() {

        int[] va, vb, vc;
        va = new int[10];
        vb = new int[10];
        vc = new int[10];
        Entrada.abrir();
        for (int j = 0; j < 10; j++) {
            va[j] = Entrada.lerInt();
            vb[j] = Entrada.lerInt();
        }
        Entrada.fechar();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vc[i] = va[i] + vb[i];
            }
            if (i % 2 != 0) {
                vc[i] = va[i] - vb[i];

            }
        }
        System.out.println("");
        System.out.print("Va= [");

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(va[i] + ", ");
            } else {
                System.out.print(va[i] + "] ");
            }
        }
        System.out.println("");
        System.out.print("Vb= [");

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vb[i] + ", ");
            } else {
                System.out.print(vb[i] + "] ");
            }
        }
        System.out.println("");
        System.out.print("Vc= [");

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vc[i] + ", ");
            } else {
                System.out.print(vc[i] + "] ");
            }

        }
    }

    public static void trocaNumeroNegativo() {
        int[] a;
        a = new int[10];
        Entrada.abrir();
        for (int j = 0; j < 10; j++) {
            a[j] = Entrada.lerInt();
        }
        Entrada.fechar();
        System.out.print("Vetor inicial: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                a[i] = a[i] * 0;
            }
        }

        System.out.print("Vetor modificado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
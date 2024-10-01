package aulas;

import libs.Entrada;

public class aula25 {
    public static void aula() {
        System.out.println("Aula do dia 15/09 - Vetores");
        paresImparesAoContrario();
    }

    public static void paresImparesAoContrario() {
        int[] va = new int[10];
        int[] vb = new int[10];
        int idx1 = 0, idx2 = vb.length - 1;
        Entrada.abrir();
        for (int i = 0; i < va.length; i++) {
            va[i] = Entrada.lerInt();
        }
        Entrada.fechar();

        for (int i = 0; i < va.length; i++) {
            if (va[i] % 2 == 0) {
                vb[idx1] = va[i];
                idx1++;
            } else if (idx1 != idx2) {
                vb[idx2] = va[i];
                idx2--;
            }
            System.out.println();
        }
        for (int i = 0; i < vb.length; i++) {
            System.out.print(vb[i]);
        }
    }
}

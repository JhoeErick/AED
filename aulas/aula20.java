package aulas;

import libs.Entrada;
import libs.Matematica;

public class aula20 {
    public static void aula() {
        System.out.println("++ Aula do dia 09/08/2024++");
        exLerInteiro();
    }

    public static void exLerInteiro() {
        Entrada.abrir();

        int x = Entrada.lerInt("digite um numero");
        int y = Entrada.lerInt("digite outro");
        int j;
        System.out.println("Foi digitado o valor " + x);

        j = Matematica.menor(x, y);
        System.out.println("o menor valor foi" + j);
        Entrada.fechar();
    }
}

package aulas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import libs.Entrada;
import libs.caractere;
import libs.Vetores;
import libs.tempo;

public class aula35 {
    public static void aula() {
        System.out.println("Aula do dia 31/10 - Fila e Pilha");
        // ex01();
        ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(15);
        fila.add(20);
        fila.add(50);
        fila.add(-10);
        fila.add(18);

        System.out.println(fila.isEmpty());

        int x = fila.poll();
        System.out.println(x);

        while (!fila.isEmpty()) {
            x = fila.poll();
            System.out.println(x);
        }

    }

    public static void ex02() {
        Stack<Integer> pilha = new Stack<>();
        int x;

        pilha.add(15);
        pilha.add(20);
        pilha.add(50);
        pilha.add(-10);
        pilha.add(18);

        while (!pilha.isEmpty()) {
            x = pilha.pop();
            System.out.println(x);
        }

    }

    public static void ex03() {

    }

    public static double calcularPolonesaReversa(String[] valores) {
        Stack<Double> operandos = new Stack<>();
        double num1, num2;



        return operandos.pop();

        
    }

    public static void ex04() {

    }
}
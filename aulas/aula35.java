package aulas;

import java.util.LinkedList;
import java.util.Queue;
import libs.Entrada;
import libs.caractere;
import libs.Vetores;
import libs.tempo;

public class aula35 {
    public static void aula() {
        System.out.println("Aula do dia 31/10 - Fila");
        ex01();
        //ex02();
        //ex03();
        //ex04();
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


    while(!fila.isEmpty()) {
        x = fila.poll();
        System.out.println(x);
    }

    }

public static void ex02() {

}

public static void ex03() {

}

public static void ex04() {

}

}

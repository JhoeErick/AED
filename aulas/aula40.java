package aulas;
import libs.*;

public class aula40 {
    public static void aula() {
        System.out.println("Aula do dia 24/11 - Counting Sort");
        ex01();
        //ex02();
        //ex03();
        //ex04();
    }
    public static void ex01() {
        int[] vetor = { 7 , 2 , 9 , 2 , 7 , 1 , 9 , 2 , 0 };
        System.out.println("Entrada: ");
        Vetores.mostrarVetor(vetor);

        System.out.println("-------");

        int[] vetor_ordenado = Vetores.countingSort(vetor);
        System.out.println("Saída: ");
        Vetores.mostrarVetor(vetor_ordenado);

        System.out.println("-------");
        

    }
}

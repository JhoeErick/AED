package aulas;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import libs.Entrada;
import libs.caractere;
import libs.Vetores;
import libs.tempo;

public class aula36 {
    public static void aula(){
        System.out.println(" ## Fila ##");

        //ex01();
        ex02();
        //ex03();
        //ex04();

    }

    public static void ex01(){

    LinkedList<Integer> lista = new LinkedList<>();
    int i;
    int x;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(40);

    for(i=0; i <lista.size(); i++){
        x= lista.get(i);
        System.out.printf("[%d] %d\n", i,x);
    }
    System.out.println("---------");
    lista.add(3,500);
    lista.set(5,400);

    for(i=0; i<lista.size(); i++){
        x = lista.get(i);
        System.out.printf("[%d] %d\n", i,x);

    }

    System.out.println(("-------"));
    for (int y :lista){
        System.out.println(y);
    }

    }
    public static void ex02(){
        Set <Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(20);
        conjunto.add(50);

        for(int y : conjunto){
            System.out.println(y);
        }
        System.out.println("Elemento 30 está no conjunto: "+ conjunto.contains(30));
        System.out.println("Elemento 70 está no conjunto: "+ conjunto.contains(70));



        Iterator<Integer> it = conjunto.iterator();
        System.out.println((it.hashCode()));
        }
}
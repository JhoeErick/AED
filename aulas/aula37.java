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
import java.util.Hashtable;
import java.util.Arrays;
import java.util.Collections;

public class aula37 {
    public static void aula(){
        System.out.println(" ## Fila ##");

        //ex01();
        //ex02();
        //ex03();
        ex04();

    }

    public static void ex01(){
        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("batata", 10);
        tabela.put("carne", 15);
        tabela.put("abacate", 3);

        for(String posicao : tabela.keySet()){
            System.out.printf("[%S]\t%d\n",posicao,tabela.get(posicao));
        }

    }
    public static void ex02(){
        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanha hoje nao e ontem nem amanha";

        String[] palavras = msg.split(" ");
        String palavra;
        int i;

        for(i = 0; i < palavras.length; i++){
            System.out.println(palavras[i]);
        }
        Hashtable<String, Integer> contador = new Hashtable<>();
        for(i = 0; i < palavras.length; i++){

            if(contador.containsKey(palavras[i])){
                contador.put(palavras[i], contador.get(palavras[i]) + 1);
            }else{
                contador.put(palavras[i], 1);
            }
        }
        for(String posicao : contador.keySet()){
            System.out.printf("[%s]\t%d\n",posicao,contador.get(posicao));
        }
    }
    public static void ex03(){
        System.out.println("Vetor esparso");

        int [] vetor = {0,0,0,0,0,50,60,0,0,0,0,0,90,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20};
        int i;
        Hashtable<Integer, Integer> vetor_esparso = new Hashtable<>();
        for(i = 0; i < vetor.length; i++){
            if(vetor[i]!= 0){
                vetor_esparso.put(i, vetor[i]);
            }
        }
        for(Integer posicao : vetor_esparso.keySet()){
            System.out.printf("[%d] - %d - %d\n", i, vetor[i],vetorEsparso(vetor_esparso, i));
        }
    }
    public static int vetorEsparso(Hashtable<Integer, Integer> vetor_esparso, int posicao){
        if(vetor_esparso.containsKey(posicao)){
            return vetor_esparso.get(posicao);
        }
        return 0;
    }
    public static void ex04(){
        //Algoritmos de Ordenação
    }
}


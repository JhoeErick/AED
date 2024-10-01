package aulas;

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class aula30 {
    public static void aula() {
        //ex1();
        ex2();
        //ex3();
    // }
    // public static void ex1() {
    //     String nome_arquivo = "texte.txt";
    //     try{
    //         FileWriter arquivo = new FileWriter(nome_arquivo);
    //         arquivo.write("Algoritmos\n");
    //         for (int i = 1; i <=30; i++) {
    //             arquivo.write(i + " wilian incomoda muita gente "+ i + 1+" incomoda muito mais\n");
    //         }
    //         arquivo.close();
    //     }catch(Exception e){
    //         System.err.println("Erro");
    //         System.err.println(e);
    //     }
     }
    public static void ex2() {
        int i;
        String nome;
        int valor;
        

        String nome_arquivo = "numeros.txt";
        try {
            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);
            for ( i = 0; i <20 ; i++) {
                int numero = entrada.nextInt();
                System.out.println(numero);
            }
            valor =entrada.nextInt();
            System.out.println(valor);
            
            entrada.close();
        }catch(Exception e){
            System.err.println("Erro");
            System.err.println(e);
        }
    }
}

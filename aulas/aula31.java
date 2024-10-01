package aulas;

import java.io.File;
import java.util.Scanner;

public class aula31 {
    public static void aula() {
        System.out.println("++ Aula 31: Mais arquivos++");
        //ex1();
        ex2();
    }
    
    public static void ex1() {
        int i;
        int soma = 0, valor_lido;
        double media;

        String nome_arquivo = "./arquivos/valores_10txt";
        try {
            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            for (i = 0; i < 5; i++) {
                valor_lido = entrada.nextInt();
                soma += valor_lido;
            }
            media = soma / 10;
            

        
            System.out.println("Média:" + media+"%");

        } catch (Exception e) {
            System.err.println("Erro");
            System.err.println(e);

            }
        }
        public static void ex2(){

        }
    }


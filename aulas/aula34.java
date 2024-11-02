package aulas;
import libs.tempo;
import libs.Vetores;
import libs.tempo;
import libs.Entrada;

public class aula34 {
    public static void aula() {
        System.out.println("Aula 34 - Busca Sequencial- Aleatoria");
        //ex1();
        //ex2();
        ex3();
        //ex4();
    }

    public static void ex1() {
        Entrada.abrir();
        int[] v = Vetores.gerarValoresAleatorios(10000, 0, 5000);
        int x = Entrada.lerInt("digite um numero para a busca");
        int indice = BuscaSequencial(v, x);
        if (indice == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Valor " + x + " encontrado na posição " + indice);
        }
        Entrada.fechar();
    }

    public static int BuscaSequencial(int[] v, int x) {
        int i;
        for (i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void ex2(){
        Entrada.abrir();
        int [] v = Vetores.gerarValoresAleatorios(10000000, 0, 100000);
        int x = Entrada.lerInt("digite um numero para a busca");

        int pos;

        long tempo_inicio = tempo.medirTempoIniciar();
        pos = Vetores.BuscaSequencial(v, x);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        
        if (pos != -1) {
            System.out.println("Valor " + x + " encontrado na posição " + pos);
        } else {
            System.out.println("Valor " + x + " não encontrado");
        }
        System.out.println("tempo de procura: "+tempo_segundos+" segundos");
        System.out.println("");
        Entrada.fechar();
    }
    public static void ex3(){
        for(int i=0;i<10;i++){
        Entrada.abrir();
        
        int [] v = Vetores.gerarValoresAleatorios(10000000, 0, 100000);
        int x = Entrada.lerInt("digite um numero para a busca");

        int pos;
        
        long tempo_inicio = tempo.medirTempoIniciar();
        pos = Vetores.BuscaSequencial(v, x);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        
        if (pos != -1) {
            System.out.println("Valor " + x + " encontrado na posição " + pos);
        } else {
            System.out.println("Valor " + x + " não encontrado");
        }
        System.out.println("tempo de procura: "+tempo_segundos+" segundos");
        System.out.println("");
        Entrada.fechar();
    }
}
    public static void ex4(){
        Entrada.abrir();
        System.out.println("gerando valores aleatorios");
        int [] v = Vetores.gerarValoresAleatoriosOrdenado(10000000, 0, 100000);
        int x = Entrada.lerInt("digite um numero para a busca");

        int pos;

        long tempo_inicio = tempo.medirTempoIniciar();
        pos = Vetores.BuscaSequencial(v, x);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        
        if (pos != -1) {
            System.out.println("Valor " + x + " encontrado na posição " + pos);
        } else {
            System.out.println("Valor " + x + " não encontrado");
        }
        System.out.println("tempo de procura: "+tempo_segundos+" segundos");
        System.out.println("");
        Entrada.fechar();
    }
}
    
    
    


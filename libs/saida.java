package libs;

public class saida {
    public static void mostrarVetor(int [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(boolean [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(float [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(char [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    
}
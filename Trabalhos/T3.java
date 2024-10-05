package Trabalhos;

import libs.Entrada;

public class T3 {
    public static void aula (){
        
        Entrada.abrir();
        int[] v = {1, 2, 3, 4, 5};
        char separador = ',';
        mostrarInteiros(v, separador);
        Entrada.fechar();
    }

    public static void mostrarInteiros(int[] v, char separador) {
        System.out.print("Os valores do vetor são: "); 
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + separador);
        }
    }

}

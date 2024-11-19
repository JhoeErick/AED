package aulas;

import libs.Vetores;


public class aula38 {
    public static void aula() {
        System.out.println("Aula do dia 19/11 - Ordenação InsertionSort e SelectionSort");
        ex01();
        //ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        int[] v_0= {17,5,0,18,2,9};
    int i,j;
        Vetores.ordenarInsertionSort(v_0);
        System.out.print("[");
        for(i=0;i<v_0.length;i++){
            System.out.print(+v_0[i]+" ");
        }
        System.out.print("]");

           
    }

    public static void ex02() {
        int[] v_0= Vetores.gerarValoresAleatorios(5,0,30);
        System.out.println(v_0);
        Vetores.ordenarSelectionSort(v_0);
        System.out.print("[");
        for(int i=0;i<v_0.length;i++){
            System.out.print(+v_0[i]+" ");

        }


    }

    public static void ex03() {
        //junte 2 vetores e ordene eles num 3 vetor
        int[] va= {0,2,4,7,8};
        int[] vb= {1,3,5};
        int[] vc=new int[va.length+vb.length];
        int i,j,k;
        i=j=k=0;
        while(i<va.length && j<vb.length){
            if(va[i]<vb[j]){
                vc[k]=va[i];
                i++;
            }else{
                vc[k]=vb[j];
                j++;
            }
            k++;
        }
    }
 
}
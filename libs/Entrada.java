package libs;
import java.util.Scanner;
public class Entrada {
    public static Scanner entrada;

    public static void abrir(){
        entrada = new Scanner(System.in);
    }
    public static void fechar(){
        entrada.close();
    }
    public static int lerInt(){
        return entrada.nextInt();
    }
    public static int lerInt(String msg){
        System.out.println(msg);
        return entrada.nextInt();
    }
    public static String lerString() {
      return entrada.nextLine();
    }
    public static String lerString(String msg) {
        System.out.println(msg);
        return entrada.nextLine();
    }
    public static double lerDouble(){
        return entrada.nextDouble();
    }
    public static double lerDouble(String msg){
        System.out.println(msg);
        return entrada.nextDouble();
    }
    public static char lerChar(){
        return entrada.next().charAt(0);
    }
    public static char lerChar(String msg){
        System.out.println(msg);
        return entrada.next().charAt(0);
    }
    public static boolean lerBoolean(){
        return entrada.nextBoolean();
    }
    public static boolean lerBoolean(String msg){
        System.out.println(msg);
        return entrada.nextBoolean();
    }
    public static float lerFloat(){
        return entrada.nextFloat();
    }
    public static float lerFloat(String msg){
        System.out.println(msg);
        return entrada.nextFloat();
    }
    public static String lerPalavra() {
        return entrada.next();
    }

    public static String lerPalavra(String msg) {
        System.out.println(msg);
        return entrada.next();
    }

    public static char lerCaractere(String msg) {
        System.out.println(msg);
        return lerPalavra().charAt(0);
    }

    public static char lerCaractere() {
        return lerPalavra().charAt(0);
    }

    public static String lerFrase() {
        return entrada.nextLine();
    }

    public static String lerFrase(String msg) {
        System.out.println(msg);
        return entrada.nextLine();
    }

}


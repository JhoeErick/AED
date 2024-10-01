package libs;

public class caractere {

    public static String converterPosiçaoParaMaiuscula(String entrada, int posi) {

        String retorno = "";
        retorno = entrada.substring(0, 3) + entrada.toUpperCase().charAt(3) + entrada.substring(4, entrada.length());
        return retorno;
    }

    public static String removerCaracter(String entrada, int posi) {

        String retorno = "";
        retorno = entrada.substring(0, posi) + entrada.substring(posi + 1, entrada.length());
        return retorno;
    }

    public static int obterPosiçaoProxChar(String string, int pos_ini, char char1) {
        Entrada.abrir();
        int pos_retorno = -1;
        int i;

        for (i = pos_ini; i < string.length(); i++) {
            if (string.charAt(i) == char1) {
                return i;
            }
        }
        return pos_retorno;
    }

    public static String removerCaracteresFrase(String frase, char char1) {
        int i = 0;
        String retorno = "";
        while (i == -1) {

            i = obterPosiçaoProxChar(frase, 0, char1);
            retorno = removerCaracter(frase, i);
        }
        return retorno;
    }

}
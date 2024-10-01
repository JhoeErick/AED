package libs;


public class Matematica {

    public static int menor(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }

    }

    public static int maior(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }

    }

    public static int ehfatorial(int n) {
        int i;
        for (i = 1; n > 0; n--) {
            i = 1 * n;

        }
        return i;
    }

    public static void fibonacci(int n) {
        int i = 1, fibo = 1, f0 = 1, f1 = 1;

        while (i <= n) {
            if (i <= 2) {
                System.out.println(1);

            } else {
                fibo = f0 + f1;
                f1 = f0;
                f0 = fibo;
                System.out.println(fibo);
            }
            i++;
        }
    }

    public static int mmc(int a, int b) {
        int maior, i;
        maior = a;
        if (b > a) {
            maior = b;
        }
        for (i = maior; !(i % a == 0 && i % b == 0); i++) {
        }
        return i;
    }

    public static boolean ehDivisor(int a, int b) {
        if (b % a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ehPerfeito(int n) {
        int i, j, b = 0;
        for (i = n - 1; i >= 1; i--) {
            j = n % i;
            if (j == 0) {
                b += i;

            }
        }
        if (b == n) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ehPrimo(int n) {
        int i;
        if (n == 2) {
            return true;
        } else {
            for (i = 2; i < n; i++) {

                if (n % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }

    public static void mostrarTabuada(int k) {
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(i * k);
    }

    public static void mostrarKPrimeirosPrimos(int k) {

        int p = 2, contadorPrimos = 0;
        while (contadorPrimos <= k) {
            if (ehPrimo(p) == true) {
                System.out.println(p);
                contadorPrimos++;
            }
            p++;

        }
    }

    public static void mostrarPerfeitosIntervalo(int a, int b) {
        while (a <= b) {
            if (ehPerfeito(a) == true) {
                System.out.println(a);
            }
            a++;
        }

    }

    public static void mediaNumeros() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0 };
        float media;
        int soma;
        int quantidadeAcima = 0;
        for (int i = 0; i <= 7; i++) {
            a[i] = Entrada.lerInt();
        }
        Entrada.fechar();
        soma = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7];
        media = (float) soma / 8;
        for (int i = 0; i >= 8; i++) {
            if (a[i] > media) {
                quantidadeAcima++;

            }
            System.out.println(quantidadeAcima);
        }

    }
}
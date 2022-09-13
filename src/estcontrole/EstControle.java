package estcontrole;
import java.util.Scanner;

public class EstControle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int menor = Integer.MAX_VALUE;
        int maior = 1;
        int aux;
        int[] a = {1, 2, 3, 4, 5, 6};
        for (i = 0; i <= 5; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            a[i] = teclado.nextInt();
            if (a[i] < menor)
                menor = a[i];
            if (a[i] > maior)
                maior = a[i];
        }
        System.out.println("\n\n");
        for (i = 0; i <= 5; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("menor = " + menor);
        System.out.println("maior =" + maior);

        for (i = 0; i <= 5; i++) {
            for (j = 0; j <= 4; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }
        }
        System.out.println("\n\n");
        for (i = 0; i <= 5; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
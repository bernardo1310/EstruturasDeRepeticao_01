import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o número de termos da série: ");
        int n = read.nextInt();

        double soma = 0.0;
        int denominador = 1;

        System.out.print("S = ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(i + "/" + denominador);
            } else {
                System.out.print(" + " + i + "/" + denominador);
            }
            soma += (double) i / denominador;
            denominador += 2;
        }

        System.out.println("\nSoma da série: " + soma);
        read.close();
    }
}

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = read.nextInt();
        boolean Primo = true;

        if (num <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Primo = false;
                    break;
                }
            }
        }

        if (Primo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        read.close();
    }
}

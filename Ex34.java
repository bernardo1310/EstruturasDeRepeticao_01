import java.util.Scanner;
public class Ex34 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int contador0_25 = 0;
        int contador26_50 = 0;
        int contador51_75 = 0;
        int contador76_100 = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
            int numero = read.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero >= 0 && numero <= 25) {
                contador0_25++;
            } else if (numero >= 26 && numero <= 50) {
                contador26_50++;
            } else if (numero >= 51 && numero <= 75) {
                contador51_75++;
            } else if (numero >= 76 && numero <= 100) {
                contador76_100++;
            }
        }

        System.out.println("Total de números no intervalo [0-25]: " + contador0_25);
        System.out.println("Total de números no intervalo [26-50]: " + contador26_50);
        System.out.println("Total de números no intervalo [51-75]: " + contador51_75);
        System.out.println("Total de números no intervalo [76-100]: " + contador76_100);
        
        read.close();
    }
}

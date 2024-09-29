import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num, cont = 0;
        int finalizar = 1;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        do {
            System.out.println("Escreva um número:");
            num = read.nextInt();

            soma += num;
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }

            cont++;
            System.out.println("Deseja continuar? (1 para sim, qualquer outro número para não)");
            finalizar = read.nextInt();

        } while (finalizar == 1);

        System.out.println("Foram escritos " + cont + " números.");
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        read.close();
    }
}

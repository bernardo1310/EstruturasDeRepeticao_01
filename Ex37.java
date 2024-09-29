import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] gabarito = new String[10];
        int totalAlunos = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        int somaNotas = 0;

        System.out.println("Digite o gabarito da prova:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Questão %02d: ", (i + 1));
            gabarito[i] = read.next().toUpperCase();
        }

        while (true) {
            totalAlunos++;
            int acertos = 0;

            for (int i = 0; i < 10; i++) {
                System.out.printf("Resposta da questão %02d: ", (i + 1));
                String resposta = read.next().toUpperCase();
                if (resposta.equals(gabarito[i])) {
                    acertos++;
                }
            }

            somaNotas += acertos;
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            System.out.print("Outro aluno vai utilizar o sistema? (s/n): ");
            char continuar = read.next().toLowerCase().charAt(0);
            if (continuar != 's') {
                break;
            }
        }

        System.out.printf("Maior Acerto: %d\n", maiorAcerto);
        System.out.printf("Menor Acerto: %d\n", menorAcerto);
        System.out.printf("Total de Alunos: %d\n", totalAlunos);
        System.out.printf("Média das Notas: %.2f\n", (double) somaNotas / totalAlunos);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = read.nextInt();
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        System.out.println("Número invertido: " + numeroInvertido);

        read.close();
    }
}

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int voto;
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite seu voto (1-4 para candidatos, 5-nulo, 6-branco, 0-encerrar): ");
            voto = read.nextInt();
            if (voto == 0) {
                break;
            }
            totalVotos++;
            if (voto >= 1 && voto <= 4) {
                votosCandidatos[voto - 1]++;
            } else if (voto == 5) {
                votosNulos++;
            } else if (voto == 6) {
                votosEmBranco++;
            } else {
                totalVotos--;
            }
        }

        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.printf("Candidato %d: %d votos\n", (i + 1), votosCandidatos[i]);
        }
        System.out.printf("Votos Nulos: %d\n", votosNulos);
        System.out.printf("Votos em Branco: %d\n", votosEmBranco);
        
        if (totalVotos > 0) {
            double percentNulos = (double) votosNulos / totalVotos * 100;
            double percentBrancos = (double) votosEmBranco / totalVotos * 100;
            System.out.printf("Porcentagem de Votos Nulos: %.2f%%\n", percentNulos);
            System.out.printf("Porcentagem de Votos em Branco: %.2f%%\n", percentBrancos);
        } else {
            System.out.println("Nenhum voto foi computado.");
        }

        read.close();
    }
}

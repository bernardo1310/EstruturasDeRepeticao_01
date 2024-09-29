import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs: ");
        int qtdCDs = read.nextInt();
        double totalInvestido = 0;
        for (int i = 1; i <= qtdCDs; i++) {
            System.out.print("Digite o valor do CD " + i + ": ");
            double valorCD = read.nextDouble();
            totalInvestido += valorCD;
        }
        double mediaGasta = totalInvestido / qtdCDs;
        System.out.println("Valor total investido: R$ " + totalInvestido);
        System.out.println("Valor médio gasto por CD: R$ " + mediaGasta);
        read.close();
    }
}

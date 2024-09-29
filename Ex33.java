import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o valor da dívida: R$ ");
        double divida = read.nextDouble();
        
        System.out.println("\nValor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");
        System.out.println("--------------------------------------------------------------------------------");
        
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 0.10, 0.15, 0.20, 0.25};

        for (int i = 0; i < 5; i++) {
            int quantidadeParcelas = parcelas[i];
            double percentualJuros = juros[i];
            double valorJuros = divida * percentualJuros;
            double valorTotal = divida + valorJuros;
            double valorParcela = valorTotal / quantidadeParcelas;

            System.out.println("R$ " + String.format("%.2f", divida) + "\t\tR$ " + String.format("%.2f", valorJuros) + "\t\t" + quantidadeParcelas + "\t\t\tR$ " + String.format("%.2f", valorParcela));
        }
        read.close();
    }
}

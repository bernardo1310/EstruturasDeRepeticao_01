import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int codigo;
        int quantidade;
        double totalGeral = 0;

        System.out.println("Bem-vindo à Lanchonete!");
        System.out.println("Código\tEspecificação\tPreço");
        System.out.println("100\tCachorro Quente\tR$ 1,20");
        System.out.println("101\tBauru Simples\tR$ 1,30");
        System.out.println("102\tBauru com ovo\tR$ 1,50");
        System.out.println("103\tHambúrguer\tR$ 1,20");
        System.out.println("104\tCheeseburguer\tR$ 1,30");
        System.out.println("105\tRefrigerante\tR$ 1,00");

        while (true) {
            System.out.print("Digite o código do item (ou um código negativo para encerrar o pedido): ");
            codigo = read.nextInt();

            if (codigo < 0) {
                System.out.println("Pedido encerrado.");
                break;
            }

            System.out.print("Digite a quantidade desejada: ");
            quantidade = read.nextInt();

            double preco = 0;

            if (codigo == 100) {
                preco = 1.20;
            } else if (codigo == 101) {
                preco = 1.30;
            } else if (codigo == 102) {
                preco = 1.50;
            } else if (codigo == 103) {
                preco = 1.20;
            } else if (codigo == 104) {
                preco = 1.30;
            } else if (codigo == 105) {
                preco = 1.00;
            } else {
                System.out.println("Código inválido! Tente novamente.");
                continue; 
            }

            double valorItem = preco * quantidade;
            totalGeral += valorItem;

            System.out.printf("Valor a ser pago pelo item (Código %d): R$ %.2f\n", codigo, valorItem);
        }

        System.out.printf("Total geral do pedido: R$ %.2f\n", totalGeral);
        read.close();
    }
}

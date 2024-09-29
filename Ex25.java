import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		final float VAL =1.99f;
		double Valtable=0;
		System.out.println("Quantos produtos o cliente vai levar:");
		int quantProd = read.nextInt();
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for(int i=1;i<=50;i++) {
			Valtable+=VAL;
			System.out.println(i+" - R$ "+Valtable);
		}
		System.out.println("Sua compra foi R$"+(quantProd*VAL));
		read.close();
	}
}

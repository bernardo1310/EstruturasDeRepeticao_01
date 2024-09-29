import java.util.Scanner;
public class Ex26 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("VALOR DO PAO:");
		float val = read.nextFloat();
		double Valtable=0;
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i=1;i<=50;i++) {
			Valtable+=val;
			System.out.println(i+" - R$ "+Valtable);
		}
		read.close();
	}

}

import java.util.Scanner;
public class Ex27 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int continua=1, quant=0;
		Float val, precofinal=(float) 0;
		System.out.println("Lojas Tabajara");
		do {
			quant++;
			System.out.println("Valor do produto:");
			val = read.nextFloat();
			precofinal+=val;
			System.out.println("Produto "+quant+": R$ "+val);
			System.out.println("Mais produtos: (0-break 1-segue)");
			continua = read.nextInt();
		} while(continua!=0);
		System.out.println("Sua compra saio: R$"+precofinal);
		System.out.println("Seu dinheiro: ");
		Float dinheiro = read.nextFloat();
		System.out.println("Seu troco: R$ "+(dinheiro-precofinal));
		read.close();
	}

}

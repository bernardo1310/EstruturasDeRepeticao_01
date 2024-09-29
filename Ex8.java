import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o val 1:");
		int val1 = read.nextInt();
		System.out.println("Informe o val 2:");
		int val2 = read.nextInt();
		int soma=0;
		for(int i=val1+1; i<val2; i++) {
			soma+=i;
		}
		System.out.println("A soma do intevalo é "+soma);
		read.close();
	}
}

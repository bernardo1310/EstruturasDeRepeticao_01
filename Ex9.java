import java.util.Scanner;
public class Ex9 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o valor para a tabuada:");
		int val = read.nextInt();
		System.out.println("Tabuada de "+val);
		for(int i=0; i<=10; i++) {
			System.out.println(val+" x "+i+" = "+val*i);
		}
		
		read.close();
	}
}

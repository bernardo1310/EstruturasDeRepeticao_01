import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, i, max=10, min=0, par = 0, impar=0;
		for(i=min;i<max;i++) {
			System.out.println("num:");
			num = read.nextInt();
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de par: "+par+"\nQuantidade de impar: "+impar);
		read.close();
	}
}

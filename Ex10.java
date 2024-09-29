import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a base:");
		int base = in.nextInt();
		System.out.println("Informe a expoente:");
		int exp = in.nextInt();
		System.out.println(Math.pow(base, exp));
		in.close();
	}
}

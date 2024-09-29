import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe a quantidade de termos:");
		int quantmax = read.nextInt();
		int primeiro = 1, segundo=2;
		System.out.print("Fibonnaci: "+primeiro+" | "+segundo);
		for(int i=3; i<=quantmax; i++) {
			int prox = primeiro + segundo;
			System.out.print(prox+ " | ");
			primeiro = segundo;
			segundo = prox;
		}
		read.close();
	}
}

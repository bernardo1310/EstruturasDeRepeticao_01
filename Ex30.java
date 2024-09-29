import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		//troquei o Ex30 com o Ex29
		Scanner read = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int numero = read.nextInt();

		System.out.print("Começar por: ");
		int inicio = read.nextInt();

		System.out.print("Terminar em: ");
		int fim = read.nextInt();

		if (fim < inicio) {
			System.out.println("Erro: O valor final não pode ser menor que o valor inicial.");
		} else {
			System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
			for (int i = inicio; i <= fim; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}

		read.close();
	}
}

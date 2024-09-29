import java.util.Scanner;
public class Ex20 {
	public static void main(String[] args) {
		try (Scanner read = new Scanner(System.in)) {
			int i;
			Float nota;
			double media=0.0;
			System.out.println("Informe a quantidade de notas:");
			int quantnotas = read.nextInt();
			for(i=1;i<=quantnotas;i++) {
				System.out.println("Informe a nota "+i+":");
				nota = read.nextFloat();
				media+=nota;
			}
			System.out.println("media final: "+media/i);
			read.close();
		}
	}

}

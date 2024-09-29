import java.util.Scanner;
public class Ex21 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int pessoa, soma=0, i;
		System.out.println("Quantas pessoas teram na pesquisa:");
		int quantpessoa = read.nextInt();
		for(i=1;i<=quantpessoa;i++) {
			System.out.println("Informe a idade da "+i);
			 pessoa = read.nextInt();
			soma+=pessoa;
		}
		Float media = (float) (soma/quantpessoa);
		System.out.println("A media de idade foi: "+media);
		
		if(media<=25) {
			System.out.println("vida facil");
		} else if(media>25 && media<=60) {
			System.out.println("classe trabalhadora");
		} else {
			System.out.println("melhor idade");
		}
		read.close();
	}
}

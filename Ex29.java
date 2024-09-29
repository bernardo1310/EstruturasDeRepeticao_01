import java.util.Scanner;
public class Ex29 {
	public static void main(String[] args) {
		int cod, h, peso, finaliza = 1, somaH = 0, somaP = 0;
        int maisH = 0, menosH = 0, magro = 0, maisG = 0, cont = 0;
        int codMaisH = 0, codMenosH = 0, codMagro = 0, codMaisG = 0;
		Scanner read = new Scanner(System.in);
		do {
			cont++;
			System.out.println("Cod:");
			cod = read.nextInt();
			System.out.println("Altura:");
			h = read.nextInt();
			System.out.println("Peso:");
			peso = read.nextInt();

			somaH+=h;
			somaP+=peso;

			if(cont==1) {
				codMaisH = codMenosH = codMagro = codMaisG = cod;
				maisH=h;
				menosH=h;
				maisG=peso;
				magro=peso;
			} else {
				if(maisH<h) {
					maisH=h;
					codMaisH=cod;
				} else if (menosH>h) {
					menosH=h;
					codMenosH=cod;
				}
				if(maisG<peso) {
					maisG=peso;
					codMaisG=cod;
				} else if(magro>peso) {
					magro=peso;
					codMagro=cod;
				}
			}
			System.out.println("Deseja continuar precione 1, caso\nCaso queira sair precione 0:");
			finaliza = read.nextInt();
		} while(finaliza!=0);	
		System.out.println("TABELA INFO: ");
		System.out.println("CODIGO MAIS MAGRO: "+codMagro+" PESO: "+magro);
		System.out.println("CODIGO MAIS GORDO: "+codMaisG+" PESO: "+maisG);
		System.out.println("CODIGO MAIS ALTO: "+codMaisH+" ALTURA: "+maisH);
		System.out.println("CODIGO MAIS BAIXO: "+codMenosH+" ALTURA: "+menosH);
		System.out.println("A MEDIA DE ALTURA: "+somaH/cont);
		System.out.println("A MEDIA DE PESO: "+somaP/cont);
		read.close();
	}

}

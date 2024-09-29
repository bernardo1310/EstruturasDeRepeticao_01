import java.util.Scanner;
public class Ex28 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int continua=1, somaTemp=0, cont=0;
		Float temp;
		double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
		do {
			System.out.println("Informe a temperatura: ");
			temp = read.nextFloat();
			somaTemp+=temp;
			cont++;
			if(temp>maior) {
				maior=temp;
			} else if(temp<menor) {
				menor=temp;
			}
			System.out.println("Deseja continuar");
			continua = read.nextInt();
		} while(continua!=0);
		System.out.println("A maior temp foi: "+maior);
		System.out.println("A menor temp foi: "+menor);
		System.out.println("E a media é "+somaTemp/cont);
		read.close();
	}
}

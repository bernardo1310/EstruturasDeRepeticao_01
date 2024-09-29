import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args) {
		try (Scanner read = new Scanner(System.in)) {
			int num, i, quantdiv=0;
			System.out.println("Informe um numero:");
			num = read.nextInt();
			while(num<=0) {
				System.out.println("Informe um numero:");
				num = read.nextInt();
			}
			System.out.println("Números primos entre 1 e " + num + ":");
			 for (i=2; i <= num; i++) {
			        boolean primo = true;
			        for (int j = 2; j <= Math.sqrt(i); j++) {
			            quantdiv++;
			            if (i % j == 0) {
			                primo = false;
			                break;
			            }
			        }
			        if (primo) {
			            System.out.print(i + " | ");
			        }
			    }
			read.close();
		}
	}

}
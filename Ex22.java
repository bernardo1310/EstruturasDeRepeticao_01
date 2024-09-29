import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i, quantp, cand, cand1=0, cand2=0, cand3=0,nulo=0;
		System.out.println("Quantas pessoas que votarao:");
		quantp = read.nextInt();
		for(i=1;i<=quantp;i++) {
			System.out.println("Você vota no candidato 1, 2 ou 3:");
			cand = read.nextInt();
			if(cand==1) {
				cand1++;
			} else if(cand==2) {
				cand2++;
			} else if(cand==3){
				cand3++;
			} else {
				nulo++;
			}
			System.out.println("VOTO COMPUTADO");
		}
		System.out.println(" O Candidato 1 teve: "+cand1+" votos");
		System.out.println(" O Candidato 2 teve: "+cand2+" votos");
		System.out.println(" O Candidato 3 teve: "+cand3+" votos");
		System.out.println("tiveram "+nulo+" votos nulos");
		read.close();
	}
}

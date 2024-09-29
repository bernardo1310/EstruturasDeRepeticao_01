
public class Ex4 {
	public static void main(String[] args) {
		int po1 = 80000, po2 = 200000, ano=0;
		while (po1<po2) {
			po1+=po1*0.03;
			po2+=po2*0.015;
			ano++;
		}
		System.out.println("Para a po1 ultrapassar a pol2 foi necessário: "+ano);
	}
}

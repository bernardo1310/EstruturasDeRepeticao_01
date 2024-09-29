import java.util.Scanner;
public class Ex23 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Digite a quantidade de turmas: ");
		int qtdTurmas = read.nextInt();    
		int totalAlunos = 0;
		for (int i = 1; i <= qtdTurmas; i++) {
			int alunosNaTurma; 
			do {
				System.out.print("Digite a quantidade de alunos na turma " + i + " (máximo 40): ");
				alunosNaTurma = read.nextInt();
				if (alunosNaTurma > 40) {
					System.out.println("Erro: A turma não pode ter mais que 40 alunos.");
				}
			} while (alunosNaTurma > 40);
			totalAlunos += alunosNaTurma;
		}
		double mediaAlunos = (double) totalAlunos / qtdTurmas;
		System.out.println("A média de alunos por turma é: " + mediaAlunos);
		read.close();
	}
}

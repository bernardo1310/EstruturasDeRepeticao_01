import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int numAlunoMaisAlto = 0, numAlunoMaisBaixo = 0;
        int alturaMaisAlta = 0, alturaMaisBaixa = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno: ");
            int numAluno = read.nextInt();
            System.out.print("Digite a altura do aluno (em cm): ");
            int altura = read.nextInt();
            
            if (i == 1) {
                numAlunoMaisAlto = numAluno;
                numAlunoMaisBaixo = numAluno;
                alturaMaisAlta = altura;
                alturaMaisBaixa = altura;
            } else {
                if (altura > alturaMaisAlta) {
                    alturaMaisAlta = altura;
                    numAlunoMaisAlto = numAluno;
                }
                if (altura < alturaMaisBaixa) {
                    alturaMaisBaixa = altura;
                    numAlunoMaisBaixo = numAluno;
                }
            }
        }
        
        System.out.println("Aluno mais alto: Número " + numAlunoMaisAlto + ", Altura: " + alturaMaisAlta + " cm");
        System.out.println("Aluno mais baixo: Número " + numAlunoMaisBaixo + ", Altura: " + alturaMaisBaixa + " cm");
        
        read.close();
    }
}

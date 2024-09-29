import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = read.nextInt();
        if (n < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }
        //perguntar pro professor pq fatorial fica neg
        read.close();
    }
}

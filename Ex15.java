public class Ex15 {
    public static void main(String[] args) {
        double S = 0.0;

        for (int i = 37, j = 1; i >= 1; i--, j++) {
            double termo = (double)(i * (i + 1)) / j;
            S += termo;
            System.out.printf("Termo (%d * %d) / %d = %.2f | Soma acumulada: %.2f%n", i, i + 1, j, termo, S);
        }

        System.out.printf("%nO valor final da série S é: %.2f%n", S);
    }
}

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int codCidade, numVeiculos, numAcidentes;
        int maiorAcidentes = 0, menorAcidentes = 0;
        int cidadeMaiorAcidentes = 0, cidadeMenorAcidentes = 0;
        int totalVeiculos = 0, totalAcidentesMenos2000 = 0, cidadesMenos2000 = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Código da cidade: ");
            codCidade = read.nextInt();
            
            System.out.print("Número de veículos de passeio (em 1999): ");
            numVeiculos = read.nextInt();
            
            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
            numAcidentes = read.nextInt();
            
            totalVeiculos += numVeiculos;
            
            if (i == 1) {
                maiorAcidentes = numAcidentes;
                menorAcidentes = numAcidentes;
                cidadeMaiorAcidentes = codCidade;
                cidadeMenorAcidentes = codCidade;
            } else {
                if (numAcidentes > maiorAcidentes) {
                    maiorAcidentes = numAcidentes;
                    cidadeMaiorAcidentes = codCidade;
                }
                if (numAcidentes < menorAcidentes) {
                    menorAcidentes = numAcidentes;
                    cidadeMenorAcidentes = codCidade;
                }
            }
            
            if (numVeiculos < 2000) {
                totalAcidentesMenos2000 += numAcidentes;
                cidadesMenos2000++;
            }
        }
        
        double mediaVeiculos = totalVeiculos / 5.0;
        double mediaAcidentesMenos2000 = (cidadesMenos2000 > 0) ? totalAcidentesMenos2000 / (double) cidadesMenos2000 : 0;
        
        System.out.println("Maior índice de acidentes: Cidade " + cidadeMaiorAcidentes + " com " + maiorAcidentes + " acidentes.");
        System.out.println("Menor índice de acidentes: Cidade " + cidadeMenorAcidentes + " com " + menorAcidentes + " acidentes.");
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        if (cidadesMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcidentesMenos2000);
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos foi registrada.");
        }
        
        read.close();
    }
}

package Etapa2;

import java.util.Scanner;

public class CO11EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMultasPontuacao8PrimeiraQuinzena = 0;
        double valorTotalArrecadado = 0;

        System.out.println("===== Sistema de Multas do Detran =====");
        System.out.println("Digite 99 para encerrar o programa.");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("Digite o dia da multa (ou 99 para encerrar): ");
            int dia = scanner.nextInt();

            if (dia == 99) {
                break;
            }

            System.out.print("Digite a placa do veículo: ");
            String placa = scanner.next();

            System.out.print("Digite a quantidade de pontos: ");
            int pontos = scanner.nextInt();

            double valorMulta = 0;

            if (pontos == 3) {
                valorMulta = 42;
            } else if (pontos == 5) {
                valorMulta = 108;
            } else if (pontos == 8) {
                valorMulta = 479;

                if (dia <= 15) {
                    totalMultasPontuacao8PrimeiraQuinzena++;
                }
            } else {
                System.out.println("Pontuação não suportada!");
                continue; // Pula para a próxima iteração do loop
            }

            valorTotalArrecadado += valorMulta;

            System.out.println("----------------------------------------");
            System.out.println("Placa do veículo: " + placa);
            System.out.println("Valor da multa: R$" + valorMulta);
        }

        System.out.println("----------------------------------------");
        System.out.println("Total de multas de pontuação 8 na primeira quinzena: " + totalMultasPontuacao8PrimeiraQuinzena);
        System.out.println("Valor total arrecadado com as multas: R$" + valorTotalArrecadado);

        scanner.close();
    }
}

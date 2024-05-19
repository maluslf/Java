package Etapa2;

import java.util.Scanner;

public class CO11EX04 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nome, sexo;
            int idade, pontos, numHomens = 0, numMulheresSetePontos = 0, somaIdade = 0;
            double valorMulta, somaMulta = 0, valorTotal;

            int idadeMaisVelho = 0;
            String nomeMaisVelho = "";

            for (int x = 1; x <= 230; x++) {
                System.out.println("Informe o seu nome:");
                nome = scanner.nextLine();

                System.out.println("Informe o seu sexo F (Feminino), M(Masculino): ");
                sexo = scanner.nextLine();

                System.out.println("Informe a sua idade: ");
                idade = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                somaIdade += idade;

                System.out.println("Informe o valor de pontos perdidos: ");
                pontos = scanner.nextInt();

                System.out.println("Informe o valor da multa: ");
                valorMulta = scanner.nextDouble();

                somaMulta += valorMulta;

                if (sexo.equalsIgnoreCase("M")) {
                    numHomens++;
                }

                if (sexo.equalsIgnoreCase("F") && pontos == 7) {
                    numMulheresSetePontos++;
                }

                if (idade > idadeMaisVelho) {
                    idadeMaisVelho = idade;
                    nomeMaisVelho = nome;
                }
            }

            int totalMultas = 230;
            double porcentagemHomens = (numHomens / (double) totalMultas) * 100;
            double mediaMulta = somaMulta / totalMultas;
            int idadeMediaCondutores = somaIdade / totalMultas;

            System.out.println("A idade média dos condutores é de " + idadeMediaCondutores + " anos");
            System.out.println("O valor total das multas aplicadas foi de: R$" + somaMulta);
            System.out.println("O percentual de homens multados foi de: " + porcentagemHomens + "%");
            System.out.println("A quantidade de mulheres que perderam 7 pontos na carteira foi de: " + numMulheresSetePontos);
            System.out.println("O nome e a idade da pessoa mais velha são: " + nomeMaisVelho + " (" + idadeMaisVelho + " anos)");

            scanner.close();
        }
    }







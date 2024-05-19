package Etapa2;

import java.util.Scanner;

public class CO11EX04B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMultas = 0,somaIdades = 0, numHomensMultados = 0,numMulheresSetePontos = 0, idadeMaisVelho = 0;
        double somaMultas = 0, mediaIdade=0, porcentagemHomensMultados=0;
        String nomeMaisVelho = "";

        while (true) {
            System.out.println("Informe o nome do condutor (ou 'X' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("X")) {
                break; // Encerra o loop se o usuário digitar 'X'
            }

            System.out.println("Informe a idade do condutor:");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Informe o sexo do condutor (M/F):");
            String sexo = scanner.nextLine();

            System.out.println("Informe a quantidade de pontos perdidos na carteira:");
            int pontos = Integer.parseInt(scanner.nextLine());

            System.out.println("Informe o valor da multa:");
            double valorMulta = Double.parseDouble(scanner.nextLine());

            // Atualiza os totais e estatísticas
            totalMultas++;
            somaIdades += idade;
            somaMultas += valorMulta;

            if (sexo.equalsIgnoreCase("M")) {
                numHomensMultados++;
            }

            if (sexo.equalsIgnoreCase("F") && pontos == 7) {
                numMulheresSetePontos++;
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }
        }

        mediaIdade = somaIdades / totalMultas;
        porcentagemHomensMultados = (numHomensMultados / totalMultas) * 100;

        System.out.println("Idade média dos condutores: " + mediaIdade);
        System.out.println("Valor total das multas aplicadas: R$" + somaMultas);
        System.out.println("Percentual de homens multados: " + porcentagemHomensMultados + "%");
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + numMulheresSetePontos);
        System.out.println("Pessoa mais velha: " + nomeMaisVelho + " (idade: " + idadeMaisVelho + ")");

        scanner.close();
    }
}
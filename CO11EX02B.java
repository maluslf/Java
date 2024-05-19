package Etapa2;

import java.util.Scanner;

public class CO11EX02B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario = "", clienteMenorAplicacao = "";
        int bronze = 0, prata = 0, ouro = 0, termos;
        double volumeAplicacoesbronze = 0, volumeAplicacoes = 0, mediaBronze = 0, contadorAplicacoes = 0, contadorBronze = 0, valorAplicado = 0, contadorPrata = 0, contadorOuro = 0, menorValorAplicado = 0;
        do {
            System.out.print("Informe o seu nome: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Informe o valor aplicado: ");
            valorAplicado = scanner.nextDouble();

            if (valorAplicado <= 1000) {
                System.out.println("Você se enquadra na categoria Bronze");
                contadorBronze++;
                volumeAplicacoesbronze += valorAplicado;
            } else if (valorAplicado <= 5000) {
                System.out.println("Você se enquadra na categoria Prata");
                contadorPrata++;
            } else {
                System.out.println("Você se enquadra na categoria Ouro");
                contadorOuro++;
            }


            contadorAplicacoes++;
            volumeAplicacoes += valorAplicado;

            if (valorAplicado < menorValorAplicado) {
                menorValorAplicado = valorAplicado;
                clienteMenorAplicacao = nomeUsuario;
            }

            scanner.nextLine();

            if (contadorBronze > 0) {
                mediaBronze = volumeAplicacoesbronze / contadorBronze;
            }
        }while (!nomeUsuario.equalsIgnoreCase("Reynaldo Duarte")) ;

            System.out.println("O número de aplicações na categoria Bronze foi: " + contadorBronze);
            System.out.println("O número de aplicações na categoria Prata foi: " + contadorPrata);
            System.out.println("O número de aplicações na categoria Ouro foi: " + contadorOuro);
            System.out.println("O cliente que fez a menor aplicação foi: " + clienteMenorAplicacao);
            System.out.println("O volume de aplicações foi de " + volumeAplicacoes + " reais");
            System.out.println("A média das aplicações categoria Bronze foi de: " + mediaBronze);

            scanner.close();
        }
    }



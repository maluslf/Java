package Etapa3;

import java.util.Scanner;

public class C012EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilhetes = new int[5];

        // Ler os números dos bilhetes
        for (int aux = 0; aux < 5; aux++) {
            System.out.println("Digite o número do bilhete" + (aux + 1) + ": ");
            bilhetes [aux] = scanner.nextInt();
        }

        //Ler o n° do bilhete sorteado
        System.out.println("Digite o número do bilhete sorteado:");
        int bilhetesorteado = scanner.nextInt();

        //Verificar se o bilhete sorteado está entre os bilhetes comprados
        boolean premiado = false;
        for (int bilhete : bilhetes) {
            if (bilhete == bilhetesorteado) {
                premiado = true;
                break;
            }
        }

        //mostrar se a pessoa foi sorteada ou não
        if (premiado) {
            System.out.println("Parabéns! Você foi sorteado!");
        } else {
            System.out.println("Que pena! Você não foi sorteado!");
        }
    }
}

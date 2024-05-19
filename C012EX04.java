package Etapa4;

import java.util.Scanner;

public class C012EX04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os números dos corredores da primeira bateria
        int[] corredores = new int[20];

        // Leitura dos números dos corredores
        System.out.println("Digite os números dos 20 corredores da primeira bateria:");
        for (int i = 0; i < corredores.length; i++) {
            System.out.print("Corredor " + (i + 1) + ": ");
            corredores[i] = scanner.nextInt();
        }

        // Listagem da ordem de largada das duplas na segunda bateria
        System.out.println("\nOrdem de largada das duplas na segunda bateria:");
        for (int i = 0; i < 10; i++) {
            int corredor1 = corredores[i]; // Corredor da posição i (1 a 10)
            int corredor2 = corredores[i + 10]; // Corredor da posição i+10 (11 a 20)
            System.out.println("Dupla " + (i + 1) + ": Corredor " + corredor1 + " e Corredor " + corredor2);
        }

        scanner.close();
    }
}
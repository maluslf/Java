package Etapa4;

import java.util.Scanner;

public class C012EX01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int vet[] = new int[10];
        int count = 0;

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
                System.out.println(vet[aux] + " é divisível por 5 e 7");
                count++;
            }
            System.out.println("Total de números divisíveis por 5 e 7: " + count);
            teclado.close();
        }
    }
}
package Etapa4;

import java.util.Scanner;

public class C012EX03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int vet[] = new int[10];

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux = 0; aux < vet.length; aux++) {
            int sqaure = vet[aux] * vet[aux]; {
                System.out.println("O quadrado de " + vet[aux] + " é " + sqaure);
            }
            teclado.close();
        }
    }
}
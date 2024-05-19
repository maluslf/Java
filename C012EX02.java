package Etapa4;

import java.util.Scanner;

public class C012EX02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int vet[] = new int[10];

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }

        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] > 5 && vet[aux] < 10) {
                System.out.println(vet[aux] + " é maior que 5 e menor que 10");
            }
            teclado.close();
        }
    }
}
package Etapa3;

import java.util.Scanner;

public class C012EX15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String temp;

        String NOME[] = new String[12];

        for (int aux = 0; aux < NOME.length; aux++) {

            System.out.print("Digite o Mês:  ");

            NOME[aux] = teclado.nextLine();

        }

        for (int aux = 0; aux < NOME.length - 1; aux++)

            for (int x = 0; x < NOME.length - 1; x++)

                if (NOME[x].compareToIgnoreCase(NOME[x + 1]) > 0) {

                    temp = NOME[x];

                    NOME[x] = NOME[x + 1];

                    NOME[x + 1] = temp;

                }

        for (int aux = 0; aux < NOME.length; aux++)

            System.out.println(aux + " - " + NOME[aux]);

        teclado.close();
    }
}
//Maria Luiza Da Silva Freitas D24672
package Etapa3;

import java.util.Scanner;

public class C14EX01D {
    public int calculo (int numero_aleatorio) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int cont = 0;
        do {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            cont++;
            if (numero < numero_aleatorio) {
                System.out.println("O número é maior!");
            } else if (numero > numero_aleatorio) {
                System.out.println("O número é menor!");
            }
        } while (numero!= numero_aleatorio);
        return cont;
    }
}

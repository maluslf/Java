//Maria Luiza Da Silva Freitas D24672
package Etapa3;

import java.util.Scanner;

public class C013EX02 {
    public static void main(String[] args) {
        double x, fx = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o valor de X (digite -1 para sair): ");
            x = teclado.nextDouble();
            if (x != -1) {
                System.out.println("O valor de f(X) é: " + C013EX02B.valorDeFx(x));
            }
        } while (x != -1);

        teclado.close();
        System.out.println("Programa encerrado.");
    }
}
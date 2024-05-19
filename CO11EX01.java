package Etapa2;

import java.util.Scanner;

public class CO11EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite superior para x: ");
        int limite = scanner.nextInt();

        double soma = 0;
        int contador = 0;

        for (int x = 1; x <= limite; x += 2) {
            double fx = Math.pow(x, 2) + (4 * x - 2) / 5.0;
            soma += fx;
            contador++;
            System.out.println("f(" + x + ") = " + fx);
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média dos valores de f(x) calculados é: " + media);
        } else {
            System.out.println("Nenhum valor calculado. Certifique-se de que o limite superior é positivo.");
        }

        scanner.close();
    }
}

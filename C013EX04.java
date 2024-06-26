//Maria Luiza Da Silva Freitas D24672
package Etapa3;

import java.util.Random;
import java.util.Scanner;

public class C013EX04 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101); // Gera um número aleatório entre 0 e 100

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.println("Adivinhe o número (entre 0 e 100):");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("O número é maior!");
            } else if (guess > randomNumber) {
                System.out.println("O número é menor!");
            }
        } while (guess != randomNumber);

        System.out.println("Parabéns! Você adivinhou o número em " + attempts + " tentativas.");

        scanner.close();
    }
}
package Etapa3;

import java.util.Scanner;

public class C013EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da família:");
        String familia = scanner.nextLine();

        int contadorMembros = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite um nome completo:");
            String nomeCompleto = scanner.nextLine();

            if (nomeCompleto.endsWith(familia)) {
                contadorMembros++;
            }
        }

        System.out.println("O número de pessoas que podem ser desta família é: " + contadorMembros);

        scanner.close();
    }
}
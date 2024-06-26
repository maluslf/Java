package Etapa3;

import java.util.Scanner;

public class C013EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo de uma pessoa:");
        String nomeCompleto = scanner.nextLine();

        // Divide o nome completo em palavras
        String[] palavras = nomeCompleto.split(" ");

        // O último sobrenome é o último elemento do array
        String ultimoSobrenome = palavras[palavras.length - 1];

        System.out.println("O último sobrenome é: " + ultimoSobrenome);

        scanner.close();
    }
}
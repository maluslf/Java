package Etapa3;

import java.util.Scanner;

public class C013EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo de um autor:");
        String nomeCompleto = scanner.nextLine();

        // Divide o nome completo em palavras
        String[] palavras = nomeCompleto.split(" ");

        // O último sobrenome é o último elemento do array
        String ultimoSobrenome = palavras[palavras.length - 1].toUpperCase();

        // Formata os primeiros nomes
        StringBuilder primeirosNomes = new StringBuilder();
        for (int i = 0; i < palavras.length - 1; i++) {
            primeirosNomes.append(palavras[i].charAt(0)).append(". ");
        }

        // Formata o nome do autor de acordo com as normas da ABNT
        String nomeFormatado = ultimoSobrenome + ", " + primeirosNomes.toString().trim();

        System.out.println("O nome do autor formatado é: " + nomeFormatado);

        scanner.close();
    }
}
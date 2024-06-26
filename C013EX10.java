package Etapa3;

import java.util.Scanner;

public class C013EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo de uma pessoa:");
        String nomeCompleto = scanner.nextLine();

        // Converte o nome completo para maiúsculas
        String nomeCompletoMaiusculas = nomeCompleto.toUpperCase();

        // Imprime cada caractere em uma linha separada
        for (int i = 0; i < nomeCompletoMaiusculas.length(); i++) {
            System.out.println(nomeCompletoMaiusculas.charAt(i));
        }

        scanner.close();
    }
}
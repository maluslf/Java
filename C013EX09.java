package Etapa3;

import java.util.Scanner;

public class C013EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase curta:");
        String frase = scanner.nextLine();

        // Divide a frase em palavras
        String[] palavras = frase.split(" ");

        // Formata as palavras
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            String primeiraLetra = palavra.substring(0, 1).toUpperCase();
            String restoDaPalavra = palavra.substring(1).toLowerCase();
            palavras[i] = primeiraLetra + restoDaPalavra;
        }

        // Junta as palavras de volta em uma frase
        String fraseFormatada = String.join(" ", palavras);

        System.out.println("A frase formatada é: " + fraseFormatada);

        scanner.close();
    }
}
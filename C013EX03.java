//Maria Luiza Da Silva Freitas D24672
package Etapa3;
import java.util.Scanner;

public class C013EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Digite a posição do dígito que deseja extrair (em ordem inversa):");
        int posicao = scanner.nextInt();

        int digito = extrairDigito(numero, posicao);

        System.out.println("O dígito na posição " + posicao + " é: " + digito);

        scanner.close();
    }

    public static int extrairDigito(int numero, int posicao) {
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        char digitoChar = numeroInvertido.charAt(posicao - 1);
        return Character.getNumericValue(digitoChar);
    }
}

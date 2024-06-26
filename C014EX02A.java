//Maria Luiza Da Silva Freitas D24672
package Etapa3;
import java.util.Scanner;

public class C014EX02A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        C014EX02 calculadora = new C014EX02();

        System.out.println("Digite o código de uma figura geométrica (1-quadrado, 2-retângulo, 3-triângulo retângulo, 4-círculo):");
        int codigo = scanner.nextInt();

        double area;
        switch (codigo) {
            case 1:
                area = calculadora.calcularAreaQuadrado();
                break;
            case 2:
                area = calculadora.calcularAreaRetangulo();
                break;
            case 3:
                area = calculadora.calcularAreaTriangulo();
                break;
            case 4:
                area = calculadora.calcularAreaCirculo();
                break;
            default:
                System.out.println("Código inválido.");
                return;
        }

        System.out.println("A área da figura selecionada é: " + area);
    }
}
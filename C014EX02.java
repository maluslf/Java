//Maria Luiza Da Silva Freitas D24672
package Etapa3;
import java.util.Scanner;

public class C014EX02 {
    private Scanner scanner = new Scanner(System.in);

    public double calcularAreaQuadrado() {
        System.out.println("Digite o valor do lado do quadrado:");
        double lado = scanner.nextDouble();
        return lado * lado;
    }

    public double calcularAreaRetangulo() {
        System.out.println("Digite o valor da base do retângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do retângulo:");
        double altura = scanner.nextDouble();
        return base * altura;
    }

    public double calcularAreaTriangulo() {
        System.out.println("Digite o valor da base do triângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do triângulo:");
        double altura = scanner.nextDouble();
        return (base * altura) / 2;
    }

    public double calcularAreaCirculo() {
        System.out.println("Digite o valor do raio do círculo:");
        double raio = scanner.nextDouble();
        return Math.PI * raio * raio;
    }
}
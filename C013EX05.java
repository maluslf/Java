//Maria Luiza Da Silva Freitas D24672
package Etapa3;

import java.util.Scanner;

public class C013EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ângulo em graus:");
        double anguloGraus = scanner.nextDouble();

        // Converte o ângulo para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Calcula o seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        // Calcula o arco seno, arco cosseno e arco tangente
        double arcoSeno = Math.toDegrees(Math.asin(seno));
        double arcoCosseno = Math.toDegrees(Math.acos(cosseno));
        double arcoTangente = Math.toDegrees(Math.atan(tangente));

        // Imprime os resultados
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Arco Seno: " + arcoSeno);
        System.out.println("Arco Cosseno: " + arcoCosseno);
        System.out.println("Arco Tangente: " + arcoTangente);

        scanner.close();
    }
}
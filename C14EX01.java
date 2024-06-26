package Etapa3;

import java.util.Scanner;

public class C14EX01 {
    public static void main(String[] args) {

        C14EX01A objA = new C14EX01A();
        objA.valornumerico(10);
        System.out.println( objA.valornumerico(10) + " é divisor da soma dos números informados");

        C14EX01B objB = new C14EX01B();
        objB.Calcularfx(10);
        System.out.println("O valor de eixo maior é: " + objB.Calcularfx(10));

        C14EX01C objC = new C14EX01C();
        objC.pegarposicao(10);
        System.out.println("O caracter na posição 10 é: " + objC.pegarposicao(10));

        C14EX01D objD = new C14EX01D();
        objD.calculo(20);
        System.out.println("O resultado do calculo é: "+ objD.calculo(10));

        C14EX01E objE = new C14EX01E();
        objE.raiz(64);
        System.out.println("A raiz quadrada de 64 é: " + objE.raiz(100));
    }
}
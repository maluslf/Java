//Maria Luiza Da Silva Freitas D24672
package Etapa3;

public class C14EX01C {
    public static int pegarposicao (int numero) {
        int numeroprocurado;
        int posicao = 0;
        numeroprocurado = (int) (numero % Math.pow(10,posicao) % 10);
        return numeroprocurado;
    }

}

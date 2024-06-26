//Maria Luiza Da Silva Freitas D24672
package Etapa3;

public class C14EX01B {
    public static double Calcularfx(double x) {
        double fx;
        if (x > 4)
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        else if (x < 4)
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        else
            fx = 0;
        return fx;
    }
}

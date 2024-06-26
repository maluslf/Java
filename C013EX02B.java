//Maria Luiza Da Silva Freitas D24672
package Etapa3;
class C013EX02B {

    static double valorDeFx(double x) {
        double fx;
        if (x == 4)
            fx = 0;
        else if (x < 4)
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        else
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        return fx;
    }
}


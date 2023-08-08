package com.example;

public class MathUtil {
    static int mdc(int a, int b) {

        //System.out.println("Numeros pré-math: " + Integer.toString(a) + " e " + Integer.toString(b));
        a = Math.abs(a);
        b = Math.abs(b);
        
        int maiorValor = Math.max(a, b);
        b = Math.min(a, b);
        a = maiorValor;
        //System.out.println("Numeros pós-math: " + Integer.toString(a) + " e " + Integer.toString(b));

        if (b > 0 && a % b == 0) {
            return b;
        }

        if (b == 0) {
            //return a * -1;
            return Math.abs(a);
        }

        //return -1;
        //throw new UnsupportedOperationException("Não é possível calcular o MDC dos valores: \n" + Integer.toString(a) + " e " + Integer.toString(b) + ",");
        //return 1;
        return mdc(a - b, b);

    }
}

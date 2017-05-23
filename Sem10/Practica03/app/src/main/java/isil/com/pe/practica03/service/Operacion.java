package isil.com.pe.practica03.service;


public class Operacion {
    public long factorial(int numero) {
        long f = 1;
        for (int i = 2; i <= numero; i++) {
            f *= i;
        }
        return f;
    }

    public int mcd(int numero1, int numero2) {
        while (numero1 != numero2) {
            if (numero1 > numero2) {
                numero1 = numero1 - numero2;
            } else {
                numero2 = numero2 - numero1;
            }
        }
        return numero1;
    }
}

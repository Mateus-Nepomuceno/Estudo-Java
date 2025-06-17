package exercicios.javacore.e1calculadoraprimo.dominio;

public class Calculadora {

    public static boolean verificarPrimo(int num) {
        boolean ePrimo;
        int cont = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont > 2) {
            ePrimo = false;
        } else {
            ePrimo = true;
        }
        return ePrimo;
    }
}

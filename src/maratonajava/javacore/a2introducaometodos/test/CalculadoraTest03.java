package maratonajava.javacore.a2introducaometodos.test;

import maratonajava.javacore.a2introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));

        System.out.println("\n--------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}

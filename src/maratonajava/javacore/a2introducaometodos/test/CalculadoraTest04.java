package maratonajava.javacore.a2introducaometodos.test;

import maratonajava.javacore.a2introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a,b);

        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);
    }
}

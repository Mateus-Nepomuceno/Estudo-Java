package maratonajava.javacore.a2introducaometodos.test;

import maratonajava.javacore.a2introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

        calculadora.subtraiDoisNumeros();
    }
}

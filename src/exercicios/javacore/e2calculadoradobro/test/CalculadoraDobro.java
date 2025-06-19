package exercicios.javacore.e2calculadoradobro.test;

import exercicios.javacore.e2calculadoradobro.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraDobro {
    public static void main(String[] args) {
        /*
        Criar uma calculadora que recebe uma lista/array e retorna a lista
        com seus valores multiplicados por 2.

        Ex: Se entrada for [1,2,3], o retorno de [2,4,6].
         */

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double[] num = new double[3];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um número: ");
            num[i] = scanner.nextDouble();
            while (num[i] <= 0) {
                System.out.println("Erro - Digite outro número: ");
                num[i] = scanner.nextDouble();
            }
        }
        calculadora.arrayDobrado(num);
    }
}

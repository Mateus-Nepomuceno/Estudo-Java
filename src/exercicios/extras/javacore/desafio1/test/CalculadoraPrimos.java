package exercicios.extras.javacore.desafio1.test;

import java.util.Scanner;

import static exercicios.extras.javacore.desafio1.dominio.Calculadora.verificarPrimo;

public class CalculadoraPrimos {
    public static void main(String[] args) {
        /*
        Desafio 1:
        Criar uma calculadora que verifica se um número é primo ou não.
        Retorno: true se for primo, false caso contrário.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        boolean resultado = verificarPrimo(num);
        System.out.println("O número é primo? "+resultado);
    }
}

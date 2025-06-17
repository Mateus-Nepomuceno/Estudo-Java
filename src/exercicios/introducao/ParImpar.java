package exercicios.introducao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        /*
        Escreva um programa que leia 10 números inteiros e os armazene em um array. Em seguida:
        -Separe os números em dois arrays: pares e ímpares.
        -Mostre os dois arrays separadamente.
        -Exiba a quantidade de números pares e ímpares.
        */
        Scanner scanner = new Scanner(System.in);


        int num[] = new int[10];
        int par[] = new int[10];
        int impar[] = new int[10];
        int qtdImpares = 0;
        int qtdPares = 0;


        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = scanner.nextInt();

            if (num[i] % 2 == 0) {
                par[qtdPares] = num[i];
                qtdPares++;
            } else {
                impar[qtdImpares] = num[i];
                qtdImpares++;
            }
        }

        System.out.print("Números pares: ");
        for (int i = 0; i < qtdPares; i++) {
                System.out.print(par[i] + " ");
        }
        System.out.println();

        System.out.print("Números impares: ");
        for (int i = 0; i < qtdImpares; i++) {
                System.out.print(impar[i] + " ");
        }
        System.out.println();

        System.out.println("Foram digitados " + qtdPares + " números pares");
        System.out.println("Foram digitados " + qtdImpares + " números impares");

        scanner.close();
    }
}

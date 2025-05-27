package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04E {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorParcela;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        double valorTotal = scanner.nextDouble();

        for (int i = 1; i <= valorTotal; i++) {
            valorParcela = valorTotal / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("O carro é parcelado em %dx no valor de R$ %.2f%n", i, valorParcela);
        }
    }
}
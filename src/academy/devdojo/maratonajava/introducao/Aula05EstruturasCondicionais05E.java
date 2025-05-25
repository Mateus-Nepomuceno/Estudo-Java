package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05E {
    public static void main(String[] args) {

        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se o dia é útil ou não: ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
            case 7:
                System.out.println("Dia não útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

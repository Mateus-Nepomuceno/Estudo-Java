package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03E {
    public static void main(String[] args) {

        double taxa;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        if (salario<=34712) {
            taxa = salario*0.097;
        } else if (salario<=68507) {
            taxa = salario*0.3735;
        }
        else {
            taxa = salario*0.4950;
        }

        System.out.printf("Você deve pagar € %.2f de taxas", taxa);
    }
}

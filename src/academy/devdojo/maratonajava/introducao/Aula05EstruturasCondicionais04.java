package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 34459;
        double taxa;
        if (salario <= 34712) {
            taxa = salario * (9.70 / 100);
        } else if (salario <= 68507) {
            taxa = salario * (37.35 / 100);
        } else {
            taxa = salario * (49.50 / 100);
        }

        System.out.printf("A taxa do seu salário é de %.2f%n", taxa);
    }
}

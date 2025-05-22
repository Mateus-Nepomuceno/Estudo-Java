package academy.devdojo.maratonajava.javacore.Dconstrutorestest.test;

import academy.devdojo.maratonajava.javacore.Dconstrutorestest.dominio.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class RetanguloTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle width and heigth:");

        Retangulo retangulo = new Retangulo();
        double height = scanner.nextDouble();
        retangulo.setHeight(height);
        double widht = scanner.nextDouble();
        retangulo.setHeight(widht);
        retangulo.imprimeResultado(widht,height);
    }
}

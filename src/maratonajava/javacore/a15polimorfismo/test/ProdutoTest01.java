package maratonajava.javacore.a15polimorfismo.test;

import maratonajava.javacore.a15polimorfismo.dominio.Computador;
import maratonajava.javacore.a15polimorfismo.dominio.Televisao;
import maratonajava.javacore.a15polimorfismo.dominio.Tomate;
import maratonajava.javacore.a15polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Sansung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

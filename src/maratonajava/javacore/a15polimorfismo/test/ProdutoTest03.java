package maratonajava.javacore.a15polimorfismo.test;

import maratonajava.javacore.a15polimorfismo.dominio.Computador;
import maratonajava.javacore.a15polimorfismo.dominio.Produto;
import maratonajava.javacore.a15polimorfismo.dominio.Tomate;
import maratonajava.javacore.a15polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}

package maratonajava.javacore.a15polimorfismo.servico;

import maratonajava.javacore.a15polimorfismo.dominio.Computador;
import maratonajava.javacore.a15polimorfismo.dominio.Produto;
import maratonajava.javacore.a15polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if (produto instanceof Tomate) {
            System.out.println("Validade: " + ((Tomate) produto).getDataValidade());
        }
    }
}

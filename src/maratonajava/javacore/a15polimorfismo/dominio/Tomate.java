package maratonajava.javacore.a15polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_PORCENTAGEM = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}

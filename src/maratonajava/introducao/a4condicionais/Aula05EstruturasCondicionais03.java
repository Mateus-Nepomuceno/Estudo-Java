package maratonajava.introducao.a4condicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;

        // (condicao) ? verdadeiro : falso
        String resultado = salario>5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);

    }
}

package maratonajava.javacore.a13classeabstratas.test;

import maratonajava.javacore.a13classeabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.a13classeabstratas.dominio.Funcionario;
import maratonajava.javacore.a13classeabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya",12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}

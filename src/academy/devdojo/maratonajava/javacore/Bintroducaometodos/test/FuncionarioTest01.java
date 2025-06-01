package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        /*
        Crie uma classa Funcionário com os seguintes atributos:
        - nome
        - idade
        - salário - três salários devem ser guardados

        Crie dois métodos:
        1. Imprimir os dados
        2. Média dos salários e imprimir o resultado
         */

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Mateus Nepomuceno";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1512,900,600};

        funcionario.imprimirDados();
    }
}
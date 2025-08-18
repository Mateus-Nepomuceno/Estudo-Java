package maratonajava.javacore.a16excecption.exception.test;

import maratonajava.javacore.a16excecption.exception.dominio.Funcionario;
import maratonajava.javacore.a16excecption.exception.dominio.LoginInvalidoException;
import maratonajava.javacore.a16excecption.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

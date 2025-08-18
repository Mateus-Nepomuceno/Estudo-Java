package maratonajava.javacore.a16excecption.exception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário");
    }
}

package maratonajava.javacore.a15polimorfismo.servico;

import maratonajava.javacore.a15polimorfismo.repositorio.Repositorio;

public class RepositorioBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}

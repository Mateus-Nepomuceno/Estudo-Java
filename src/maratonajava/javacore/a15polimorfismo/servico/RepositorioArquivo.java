package maratonajava.javacore.a15polimorfismo.servico;

import maratonajava.javacore.a15polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}

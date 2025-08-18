package atividades.atividade1biblioteca.dominio;

public class ContaUsuario {
    private int idUsuario;
    private String nome;
    private int numLivrosEmprestados;

    public ContaUsuario(int idUsuario, String nome, int numLivrosEmprestados) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.numLivrosEmprestados = numLivrosEmprestados;
    }

    public void exibirLivrosEmprestados(){
        System.out.println("Livros Emprestados: "+this.numLivrosEmprestados);
    }

    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getNumLivrosEmprestados() { return numLivrosEmprestados; }

    public void setNumLivrosEmprestados(int numLivrosEmprestados) { this.numLivrosEmprestados = numLivrosEmprestados; }

    public void emprestarLivro(int quantidade){
        this.numLivrosEmprestados += quantidade;
        System.out.println("Empréstimo de "+quantidade+" livros realizado com sucesso.");
    }

    public void devolverLivro(int quantidade){
        if (quantidade <= this.numLivrosEmprestados) {
            this.numLivrosEmprestados -= quantidade;
            System.out.println("Devolução de "+quantidade+" livro realizada com sucesso.");
        } else {
            System.out.println("O valor excede a quantidade de livros emprestados.");
        }
    }

    @Override
    public String toString() {
        return "Usuário= " + this.idUsuario +
                ", Nome= " + this.nome +
                ", Livros Emprestados= " + this.numLivrosEmprestados;
    }
}

package maratonajava.javacore.a2introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {
        System.out.println("Dados do Funcionário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null){
            return;
        }
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario+" ");
        }
        imprimirMedia();
    }

    public void imprimirMedia() {
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;

        System.out.printf("\nMédia Salarial: %.2f%n", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
package maratonajava.javacore.a2introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;

        System.out.printf("\nMédia Salarial: %.2f%n", media);
    }
}
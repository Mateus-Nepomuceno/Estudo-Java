package maratonajava.atividades.atividade1biblioteca.test;

import maratonajava.atividades.atividade1biblioteca.dominio.ContaUsuario;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, numLivros,quant;

        System.out.print("Digite o ID do usuário: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número de livros emprestados atualmente: ");
        numLivros = sc.nextInt();

        ContaUsuario conta = new ContaUsuario(id,nome, numLivros);

        System.out.print("\nDigite a quantidade de livros a serem emprestados: ");
        quant = sc.nextInt();
        conta.emprestarLivro(quant);
        System.out.println(conta);

        System.out.print("\nDigite a quantidade de livros a serem devolvidos: ");
        quant = sc.nextInt();
        conta.devolverLivro(quant);
        System.out.println(conta);

        sc.close();
    }
}

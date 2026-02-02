package maratonajava.atividades.atividade2loja.test;

import maratonajava.atividades.atividade2loja.dominio.Loja;
import maratonajava.atividades.atividade2loja.dominio.Produto;

import java.util.Scanner;

public class LojaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja();

        System.out.print("Informe o nome da loja: ");
        loja.setNome(sc.nextLine());
        System.out.print("Informe o endereço: ");
        loja.setEndereco(sc.nextLine());

        System.out.print("\nInforme o número de produtos: ");
        int qtd = sc.nextInt();

        for (int i = 1; i < qtd+1 ; i++) {
            Produto produto = new Produto();
            System.out.println("\nInforme os Dados do Produto "+i+":");
            System.out.print("Código: ");
            produto.setCodigo(sc.nextInt());
            System.out.print("Nome: ");
            produto.setNome(sc.next());
            System.out.print("Preço: ");
            produto.setPreco(sc.nextFloat());
            System.out.print("Quantidade: ");
            produto.setQuantidade(sc.nextInt());

            loja.addProduto(produto);
        }

        System.out.println("\nProduto Mais Caro: ");
        Produto maisCaro = loja.acharMaisCaro();
        System.out.println(maisCaro);

        System.out.println("\nProduto Mais Barato: ");
        Produto maisBarato = loja.acharMaisBarato();
        System.out.println(maisBarato);

        Float media = loja.precoMedio();
        System.out.printf("\nMédia de preços: %.1f%n",media);
    }
}

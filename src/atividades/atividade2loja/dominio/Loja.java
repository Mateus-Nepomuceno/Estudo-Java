package atividades.atividade2loja.dominio;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private String endereco;
    private List<Produto> produtos = new ArrayList<>();

    public Loja() {

    }

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto acharMaisCaro() {
        Produto maisCaro = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() > maisCaro.getPreco()){
                maisCaro = produto;
            }
        }
        return maisCaro;
    }

    public Produto acharMaisBarato() {
        Produto maisBarato = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < maisBarato.getPreco()){
                maisBarato = produto;
            }
        }
        return maisBarato;
    }

    public Float precoMedio(){
        Float mediaPreco = 0f;
        for (Produto produto : produtos) {
            mediaPreco += produto.getPreco();
        }
        mediaPreco = mediaPreco/produtos.size();
        return mediaPreco;
    }

    @Override
    public String toString() {
        return  "Nome='" + nome +
                " - Endereço='" + endereco;
    }
}
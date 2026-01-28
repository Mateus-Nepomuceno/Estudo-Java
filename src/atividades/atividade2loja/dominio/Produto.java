package atividades.atividade2loja.dominio;

public class Produto {
        private Integer codigo;
        private String nome;
        private Float preco;
        private Integer quantidade;

        public Produto() {

        }

        public Produto(Integer codigo, String nome, Float preco, Integer quantidade) {
                this.codigo = codigo;
                this.nome = nome;
                this.preco = preco;
                this.quantidade = quantidade;
        }

        public Integer getCodigo() {
                return codigo;
        }

        public void setCodigo(Integer codigo) {
                this.codigo = codigo;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Float getPreco() {
                return preco;
        }

        public void setPreco(Float preco) {
                this.preco = preco;
        }

        public Integer getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
                this.quantidade = quantidade;
        }

        @Override
        public String toString() {
                return  "Nome = " + nome +
                        " - Preço = " + preco +
                        " - Quantidade = " + quantidade;
        }
}
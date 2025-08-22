package br.com.atividadesArrayList.Desafio02;

public class ProdutoPerrecivel extends Produto{

    private String dataValidade;

    public ProdutoPerrecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

}

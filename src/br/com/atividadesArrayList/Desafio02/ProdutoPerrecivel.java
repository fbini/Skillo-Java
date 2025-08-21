package br.com.atividadesArrayList.Desafio02;

public class ProdutoPerrecivel extends Produto{

    private int dataValidade;

    public ProdutoPerrecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

}

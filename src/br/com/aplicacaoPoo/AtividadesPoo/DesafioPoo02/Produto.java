package br.com.aplicacaoPoo.AtividadesPoo.DesafioPoo02;

public class Produto {
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percetual) {
        double desconto = preco * percetual / 100;
        preco -= desconto;
    }




}

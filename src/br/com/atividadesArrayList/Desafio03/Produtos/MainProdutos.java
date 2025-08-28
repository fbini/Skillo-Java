package br.com.atividadesArrayList.Desafio03.Produtos;

import java.util.ArrayList;

public class MainProdutos {
    public static void main(String[] args) {
        Produto produto_1 = new Produto("Bola", 19.99);
        Produto produto_2 = new Produto("Lápis",1.50);
        Produto produto_3 = new Produto("Caderno", 15.99);

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto_1);
        lista.add(produto_2);
        lista.add(produto_3);

        double somaPreco = 0;
        for (Produto produto : lista) {
            somaPreco += produto.getPreco();

        }

        double precoMedio = somaPreco / lista.size();
        System.out.println("Preço médio: " + precoMedio);




    }
}

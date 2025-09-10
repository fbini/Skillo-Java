package br.com.atividadesArrayList.Extra02.ListaDeProdutos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        Produto produtoBola = new Produto("Bola", 29.99);
        Produto produtoBoneca = new Produto("Boneca", 9.99);
        Produto produtoLivro = new Produto("Livro",39.99);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produtoBola);
        listaProdutos.add(produtoBoneca);
        listaProdutos.add(produtoLivro);

        System.out.println(listaProdutos.size());
        System.out.println("Todos os produtos: " + listaProdutos.toString());

        Produto maiorValor = listaProdutos.get(0);

        for (Produto list : listaProdutos){
                if (list.getPreco() > maiorValor.getPreco()) {
                    maiorValor = list;
                }
        }
        System.out.println("O produto " + maiorValor.getNome() + " tem o maior valor " + maiorValor.getPreco());






    }
}

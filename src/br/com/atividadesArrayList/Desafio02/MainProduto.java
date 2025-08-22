package br.com.atividadesArrayList.Desafio02;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        Produto balinhasDeMorango = new Produto("Balinhas de morango", 0.25,20);
        Produto boloDeCenoura = new Produto("Bolo de cenoura", 30, 2);
        Produto chocolate = new Produto("Chocolate", 7, 5);

        ProdutoPerrecivel produtoPerrecivel = new ProdutoPerrecivel("Batata", 2.50,3,"10-10-2025");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(balinhasDeMorango);
        listaDeProdutos.add(boloDeCenoura);
        listaDeProdutos.add(chocolate);

        System.out.println(listaDeProdutos.size());
        System.out.println("Terceiro produto: " + listaDeProdutos.get(2));
        System.out.println(listaDeProdutos.toString());
    }
}

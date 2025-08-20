package br.com.atividadesArrayList.Desafio01;

import br.com.aplicacaoPoo.Modelos.Filme;

import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        var pessoa = new Pessoa("Bini", 19);
        var primeiraPessoa = new Pessoa("Mariana",18);
        var segundaPessoa = new Pessoa("Gabriel", 20);
        var terceiraPessoa = new Pessoa("José", 21);

        listaDePessoas.add(pessoa);
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas.toString());



    }
}

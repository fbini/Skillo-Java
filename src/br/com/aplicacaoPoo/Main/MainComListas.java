package br.com.aplicacaoPoo.Main;

import br.com.aplicacaoPoo.Modelos.Filme;
import br.com.aplicacaoPoo.Modelos.Serie;
import br.com.aplicacaoPoo.Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);

        Filme outroFilme = new Filme("Star Wars III",2005);
        outroFilme.avalia(9);

        var filmeDaBin = new Filme("Star Wars V", 1980);
        filmeDaBin.avalia(10);

        Serie lost = new Serie("Lost", 2010);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaBin);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        /*
        * Filme f1 = filmeDaBin;
        * usada para chegar em um objeto, não transformei o objeto em f1 ele continua filmeDaBin
        * é uma variável de referência, ela também aponta para o mesmo endereço
        */

        //percorrendo a lista com o laço Foreach tradicional -
        //permite percorrer todos os elementos de uma lista sem se preocupar com indices ou tamanho
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            // se item "é um" Filme filme
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Angrid");
        buscaPorArtista.add("Cosé");
        buscaPorArtista.add("Bariana");
        buscaPorArtista.add("Dabriel");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano: ");
        System.out.println(lista);

    }
}

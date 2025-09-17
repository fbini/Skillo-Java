package br.com.screenMatch.Main;

//import MinhaPrimeiraAplicacao.AplicandoPOO.Poo.Filme; - import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes

import br.com.screenMatch.Calculos.CalculadoraDeTempo;
import br.com.screenMatch.Calculos.FiltroRecomendacao;
import br.com.screenMatch.Modelos.Episodio;
import br.com.screenMatch.Modelos.Filme;
import br.com.screenMatch.Modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Classe - Define a estrutura e comportamento dos objs.
        Instância - NomeClass nomeClass = new NomeClass();
        Objeto - nomeClass é meu objeto da classe NomeClass
        Atributo - String modelo, int ano, dentro da class.
        Metodo - Bloco de codigo que realiza uma ação específica, define o comportamento do objeto - void acelerar(){}

        */

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2010);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsPorTemporada(10);
        lost.setMinutosPorEps(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("O poderoso chefão",1970);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacao(300);
        filtroRecomendacao.filtra(episodio);

        var filmeDaBin = new Filme("Star Wars V", 1980);
        filmeDaBin.setDuracaoEmMinutos(200);
        filmeDaBin.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaBin);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }

}

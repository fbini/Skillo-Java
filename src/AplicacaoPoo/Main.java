package AplicacaoPoo;

//import MinhaPrimeiraAplicacao.AplicandoPOO.Poo.Filme; - import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes

import AplicacaoPoo.calculos.CalculadoraDeTempo;
import AplicacaoPoo.modelos.Filme;
import AplicacaoPoo.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        /*
        Classe - Define a estrutura e comportamento dos objs.
        Instância - NomeClass nomeClass = new NomeClass();
        Objeto - nomeClass é meu objeto da classe NomeClass
        Atributo - String modelo, int ano, dentro da class.
        Metodo - Bloco de codigo que realiza uma ação específica, define o comportamento do objeto - void acelerar(){}

        */

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2010);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsPorTemporada(10);
        lost.setMinutosPorEps(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("O poderoso chefão");
        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());



    }

}

package AplicacaoPoo;

//import MinhaPrimeiraAplicacao.AplicandoPOO.Poo.Filme; - import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes

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

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


    }

}

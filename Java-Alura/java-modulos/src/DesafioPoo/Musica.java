package MinhaPrimeiraAplicacao.DesafioPoo;

public class Musica {
    //Meus atributos

    String titulo;
    String artista;
    int anoLancamento;

    double somaDasAvaliacao;
    int totalDeAvaliacao;


    void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;

    }

    double media(){
        return somaDasAvaliacao / totalDeAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacao);
        System.out.println("Número de avaliações: " + totalDeAvaliacao);
    }
}

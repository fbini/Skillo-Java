package MinhaPrimeiraAplicacao.DesafioPoo;

public class MainDesafioPoo {
    public static void main(String[] args) {
        //1
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //2
        CalculadoraPoo calculadoraPoo = new CalculadoraPoo();
        System.out.println(calculadoraPoo.numeroDobrado(5));

        //3
        Musica musica = new Musica();

        musica.titulo = "Paranoid";
        musica.anoLancamento = 1970;
        musica.artista = "Black sabbath";

        musica.exibeFichaTecnica();
        musica.avalia(10);
        musica.avalia(10);
        musica.avalia(10);

        System.out.println(musica.somaDasAvaliacao);
        System.out.println(musica.totalDeAvaliacao);
        System.out.println(musica.media());



    }
}

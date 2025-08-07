package DesafioPoo01;

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

        //4
        Carro carro = new Carro();

        carro.setAno(1989);
        carro.setCor("Rosa");
        carro.setModelo("Miata");

        System.out.println("Idade do carro é: " + carro.idadeCarro() + " anos");

        carro.ficha();

        //5
        Aluno aluno = new Aluno();
        aluno.setNome("Ingrid");
        aluno.setIdade(19);
        aluno.resultado();





    }
}

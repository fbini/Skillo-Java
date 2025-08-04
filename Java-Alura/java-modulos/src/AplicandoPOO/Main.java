package MinhaPrimeiraAplicacao.AplicandoPOO;

public class Main {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme();
        poderosoChefao.nome = "O poderoso chefão";
        poderosoChefao.anoDeLancamento = 1970;
        poderosoChefao.duracaoEmMinutos = 180;

        Filme topGun = new Filme();
        topGun.nome = "Top Gun";
        topGun.anoDeLancamento = 1980;
        topGun.duracaoEmMinutos = 185;

        poderosoChefao.exibeFichaTecnica();
        topGun.exibeFichaTecnica();

        poderosoChefao.avalia(8);
        poderosoChefao.avalia(5);
        poderosoChefao.avalia(10);

        System.out.println(poderosoChefao.somaDasAvaliacoes);
        System.out.println(poderosoChefao.totalDeAvaliacoes);
        System.out.println(poderosoChefao.pegaMedia());

    }

}

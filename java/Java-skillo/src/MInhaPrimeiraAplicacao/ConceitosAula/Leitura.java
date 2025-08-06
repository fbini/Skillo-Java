package MInhaPrimeiraAplicacao2.ConceitosAula.DesafioClasses;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine(); //nextLine - string

        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt(); //nextInt - int

        System.out.println("Digite sua nota para o filme");
        double avaliacaoFilme = leitura.nextDouble(); //nextDouble - double

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);

        leitura.close();

    }
}

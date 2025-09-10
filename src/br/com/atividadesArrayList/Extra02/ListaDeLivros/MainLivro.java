package br.com.atividadesArrayList.Extra02.ListaDeLivros;

import java.util.ArrayList;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro01 = new Livro("Diário de um banana","James",2010);
        Livro livro02 = new Livro("Eu, robô", " Isaac Asimov",2012);
        Livro livro03 = new Livro("Fahrenheit 451","Ray Bradbury",2000);

        ArrayList<Livro> listaLivro = new ArrayList<>();
        listaLivro.add(livro01);
        listaLivro.add(livro02);
        listaLivro.add(livro03);

        for (Livro livro : listaLivro) {
            if (livro.getAnoPublicado() >= 2010){
                System.out.println(livro.getAnoPublicado());
            }
        }


    }
}

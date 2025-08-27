package br.com.atividadesArrayList.Desafio03.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("AU AUA UA");
    }
}

package br.com.atividadesArrayList.Desafio03.Animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("Miu miu");
    }
}

package br.com.atividadesArrayList.Desafio03.Animal;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void som(){
        System.out.println("som");
    }
}

package br.com.atividadesArrayList.Desafio03.Animal;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        Animal gato = new Gato("Lindinha");
        Animal cachorro = new Cachorro("Leona");
        //“Pegue um objeto do tipo Cachorro e trate-o como um Animal.”
        Animal animal = (Animal) cachorro;

        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(cachorro);
        lista.add(gato);

        //loop foreach para percorrer e imprimir cada elemento da lista
        for (Animal item: lista){
            System.out.println(item.getNome());

            if (item instanceof Cachorro) {
                cachorro.som();
            }
        }






    }
}

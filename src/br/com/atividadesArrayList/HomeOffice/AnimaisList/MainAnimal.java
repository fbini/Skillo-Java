package br.com.atividadesArrayList.HomeOffice.AnimaisList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal01 = new Animal("Lindinha", "Gato");
        Animal animal02 = new Animal("Luna", "Cachorro");
        Animal animal03 = new Animal("leona" , "Gato");

        ArrayList<Animal> listAnimal = new ArrayList<>(Arrays.asList(animal01, animal02, animal03));

        for (Animal animal : listAnimal){
            if (animal.getSpecies() == "Gato"){
                System.out.println(animal);
            }
        }

    }
}

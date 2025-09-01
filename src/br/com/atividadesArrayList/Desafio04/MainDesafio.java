package br.com.atividadesArrayList.Desafio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainDesafio {
    public static void main(String[] args) {
        //  Integer - Array de Int
        //  String - Array de string (obvio)
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(33);
        list.add(6);

        Collections.sort(list);
        System.out.println(list);

        Titulo titulo01 = new Titulo("Star Wars III");
        Titulo titulo02 = new Titulo("Star Wars I");
        Titulo titulo03 = new Titulo("Star Wars II");

        List<Titulo> listTitulos = new ArrayList<>();
        listTitulos.add(titulo01);
        listTitulos.add(titulo02);
        listTitulos.add(titulo03);

        Collections.sort(listTitulos);

        for (Titulo item: listTitulos){
            System.out.println(item.getNome());
        }

        List<String> listaList = new ArrayList<>();
        listaList.add("Eu");
        listaList.add("odeio");
        listaList.add("ArraysLists");
        System.out.println(listaList);

        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("Listas");
        listaLinked.add("Mais listas");
        listaLinked.add("E mais listas");
        System.out.println(listaLinked);

        //loucura :O
        List<String> listaPolimorfo;

        listaPolimorfo = new ArrayList<>();
        listaPolimorfo.add("Morfismo?");
        listaPolimorfo.add("Complexo");
        System.out.println("Lista polimorfo 1 " + listaPolimorfo);

        listaPolimorfo = new LinkedList<>();
        listaPolimorfo.add("Como-é?");
        listaPolimorfo.add("???");
        System.out.println("Lista polimorfo 2 " + listaPolimorfo);



    }
}

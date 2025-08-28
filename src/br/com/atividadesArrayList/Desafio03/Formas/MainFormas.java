package br.com.atividadesArrayList.Desafio03.Formas;

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        quadrado.lado = 5;
        circulo.raio = 10;

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(quadrado);

        /*
              //Meu array // na minha lista de nomes
            ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Gabriel");
            nomes.add("Ingrid");
            nomes.add("Zé");


      Percorra meu array atual // lista de nomes
           for(String atual : nomes) {
                // Me devolva esses valores:
                sout(atual);

           }

        */
        for (Forma forma : lista) {
            System.out.println("Áreas: " + forma.calcularArea());
        }

    }
}

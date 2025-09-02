package br.com.atividadesArrayList.DesafioExtra.AdicaoArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayListaSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ingrid", "Rodrigo", "José", "Gabriel", "Mariana", "Kai", "Marcos"));

        nomes.remove("Ingrid");

        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);

        // TipoVariavel nomeVariavel(Eu decido) : Nome da array
        // for (TipoVariavel nomeVariavel : colecao) {}
        for (String nome : nomes) {
            System.out.println(nome);
        }

        /*System.out.println("Digite seu nome para saber se está na ArrayList: ");
        String nomeRecebido = teclado.nextLine();

        //  NomeDaArrayList.contains (objeto/comparação/testa o que eu escrevo);
        if (nomes.contains(nomeRecebido)){
            System.out.println(nomeRecebido + " está na lista");

        } else {
            System.out.println("Não está na lista");
        }
        */
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 5, 3, 18, 6));

        int maior = numeros.get(0);
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
            if (numero > maior){
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("Soma total: " + soma);


    }
}

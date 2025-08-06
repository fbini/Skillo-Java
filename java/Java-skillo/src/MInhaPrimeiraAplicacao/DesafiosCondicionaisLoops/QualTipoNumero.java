package DesafiosCondicionaisLoops;

import java.util.Scanner;

public class QualTipoNumero {
    public static void main(String[] args) {
        //atividade 1
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é negativo ou positivo: ");
        int numero = teclado.nextInt();

       /* if (numero < 0){
            System.out.println("Esse número é negativo");
        } else {
            System.out.println("Esse número é positivo");
        }
        */

        // Em ternario não é possivel retornar um print, o ternario precisa retornar um valor compativel
        String resultado = numero < 0 ? "Esse número é negativo" : "Esse número é positivo";
        System.out.println(resultado);

        teclado.close();


    }
}

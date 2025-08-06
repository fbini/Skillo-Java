package DesafiosCondicionaisLoops;

import java.util.Scanner;

public class ImparEpar {
    public static void main(String[] args) {
        //tividade 5
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro para descobrir se é par ou impar: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("o número é ímpar");
        }

    }
}

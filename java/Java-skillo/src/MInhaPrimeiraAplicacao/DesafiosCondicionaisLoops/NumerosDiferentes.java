package DesafiosCondicionaisLoops;

import java.util.Scanner;

public class NumerosDiferentes {
    public static void main(String[] args) {
        //atividade 2
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite dois números");

        System.out.println("Primeiro número: ");
        int n1 = teclado.nextInt();

        System.out.println("Segundo número");
        int n2 = teclado.nextInt();

        if (n1 == n2){
            System.out.println("Os números " + n1 + " e " + n2 + " são iguais");
        } else if (n1 < n2) {
            System.out.println("O número " + n2 + " é maior que o número " + n1);
        }else {
            System.out.println("O número " + n1 + " é menor que o número " + n2);
        }
    }
}

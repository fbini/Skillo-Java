package DesafiosCondicionaisLoops;

import java.util.Scanner;

public class NumeroFatorial {
    public static void main(String[] args) {
        //atividade 6
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial dele: ");
        int numero = teclado.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado *= i;
            System.out.println(resultado);
        }
    }
}

package DesafiosCondicionaisLoops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
      //atividade 4
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite um número para fazer a tabuada dele: ");
      int numero = teclado.nextInt();

      for (int i = 1; i <=10; i++) {
         int resultado =  numero * i;
         System.out.println(numero + " x " + i + " = " +  resultado);
      }

    }
}

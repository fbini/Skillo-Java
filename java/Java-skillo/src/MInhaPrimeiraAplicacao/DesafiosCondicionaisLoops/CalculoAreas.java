package MInhaPrimeiraAplicacao2.ConceitosAula.DesafiosCondicionaisLoops;

import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        //atividade 3
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        int escolha = teclado.nextInt();
        switch(escolha) {
            case 1:
                System.out.println("Digite o número de um dos lados do quadrado para descobrir sua área: ");
                float recebeNumero = teclado.nextFloat();
                float resultadoArea = recebeNumero * recebeNumero;
                System.out.println(resultadoArea);
                break;

            case 2:
                System.out.println("Digite o raio do circulo: ");
                double raioCirculo = teclado.nextFloat();
                double raioAoQuadrado = raioCirculo * raioCirculo;
                double pi = 3.14;
                double calculo = pi * raioAoQuadrado;
                System.out.println("A área do circulo é " + calculo);
                break;
            default:
                System.out.println("Essa opção não existe");
                break;
        }
        System.out.println(escolha);

    }

}

package DesafioJogoAdivinhacao;

import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = 50;//new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Você, acertou o número em " + tentativas + " tentativas");
            } else if (numeroDigitado > numeroGerado) {
                System.out.println("O número é menor ");
            } else {
                System.out.println("O número é maior ");
            }
        }
    }
}

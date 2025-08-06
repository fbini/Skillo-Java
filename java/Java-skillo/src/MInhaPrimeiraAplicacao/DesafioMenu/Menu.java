package MinhaPrimeiraAplicacao.MinhaPrimeiraAplicacao.DesafioMenu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1500.50;


        System.out.println("**********************");
        System.out.println("\nNome no cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************");

        String menu = """
                *** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        System.out.println(menu);
        int opcao = teclado.nextInt();

        while (opcao != 4) {
            System.out.println(menu);
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atualizado é " + saldo);
                    break;

                case 2:
                    System.out.println("Qual o valor que deseja transferir");
                    double valor = teclado.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo para realizar a transferência");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Valor recebido: ");
                    double valor2 = teclado.nextDouble();
                    saldo += valor2;
                    System.out.println("Novo saldo " + saldo);
                    break;
                case 4:
                    System.out.println("Saiu");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }

         /*while (opcao != 4) {
            System.out.println(menu);
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = teclado.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);

                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = teclado.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }*/
    }
}

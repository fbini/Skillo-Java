package br.com.atividadesArrayList.Desafio05;

import java.util.Collections;
import java.util.Scanner;

public class MainDesafio05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                String texto = """
                        Compra realizada!
                        Digite 0 para SAIR ou 1 para CONTINUAR
                        """;
                System.out.println(texto);
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("******************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(cartao.getCompras());

        for (Compra compra : cartao.getCompras()){
            System.out.println(compra.getDescricao() + " - " + cartao.getSaldo());
        }
    }
}

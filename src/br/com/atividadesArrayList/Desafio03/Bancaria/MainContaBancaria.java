package br.com.atividadesArrayList.Desafio03.Bancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(111,1000);
        ContaBancaria conta2 = new ContaBancaria(222,2000);
        ContaBancaria conts3 = new ContaBancaria(333, 300);

        ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();
        listaContaBancaria.add(conta1);
        listaContaBancaria.add(conta2);
        listaContaBancaria.add(conts3);

        ContaBancaria contaMaiorSaldo = listaContaBancaria.get(0);

        for (ContaBancaria conta : listaContaBancaria){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }

        }
        System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroDaConta() + " Saldo: " + contaMaiorSaldo.getSaldo() );

    }
}

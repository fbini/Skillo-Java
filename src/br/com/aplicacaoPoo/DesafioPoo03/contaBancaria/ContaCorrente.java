package br.com.aplicacaoPoo.DesafioPoo03.contaBancaria;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal(double tarifaMensal2) {
        saldo -= tarifaMensal2;
        System.out.println("Tarifa mensal de " + tarifaMensal2 + " cobrada. Saldo atual: " + saldo);
    }
}

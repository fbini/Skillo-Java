package br.com.aplicacaoPoo.AtividadesPoo.DesafioPoo03.contaBancaria;

public class ContaBancaria {

    protected double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // valor que queremos depositar
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito da conta de: " + valor);

    }
    //valor que queremos sacar
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Não tem nada pobre");
        }

    }

    //consultar valor na conta
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);

    }
}

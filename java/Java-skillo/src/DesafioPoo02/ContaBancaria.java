package DesafioPoo02;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void saldoDaConta() {
        saldo = 1000;
        numeroConta = 123456;

    }


}

package DesafioPoo02;

public class MainDesafio2 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Ingrid");
        contaBancaria.saldoDaConta();

        System.out.println(contaBancaria.getNumeroConta());
        System.out.println(contaBancaria.getSaldo());


    }
}

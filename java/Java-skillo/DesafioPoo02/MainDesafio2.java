package DesafioPoo02;

public class MainDesafio2 {
    public static void main(String[] args) {
        //1
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Ingrid");
        contaBancaria.saldoDaConta();

        System.out.println(contaBancaria.getNumeroConta());
        System.out.println(contaBancaria.getSaldo());

        //2
        Idadepessoa idadePessoa = new Idadepessoa();
        idadePessoa.setIdade(19);
        idadePessoa.setNome("Bini");
        System.out.println(idadePessoa.getIdade());

        //3




    }
}

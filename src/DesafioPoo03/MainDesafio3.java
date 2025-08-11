package DesafioPoo03;

import DesafioPoo03.animal.Cachorro;
import DesafioPoo03.animal.Gato;
import DesafioPoo03.carro.Carro;
import DesafioPoo03.contaBancaria.ContaBancaria;
import DesafioPoo03.contaBancaria.ContaCorrente;

public class MainDesafio3 {
    public static void main(String[] args) {
        //1
        Carro carro = new Carro();
        carro.definindoPrecos(10, 20, 30);



        //2
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        //3
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        contaCorrente.cobrarTarifaMensal(10);
        contaCorrente.sacar(10);
        contaCorrente.consultarSaldo();





    }
}

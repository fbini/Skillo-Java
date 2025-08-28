package br.com.atividadesArrayList.Desafio03.Formas;

public class Quadrado implements Forma{
    double lado;
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

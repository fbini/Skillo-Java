package br.com.atividadesArrayList.Desafio03.Formas;

public class Circulo implements Forma{
    double raio;
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

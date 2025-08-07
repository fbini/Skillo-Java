package DesafioPoo01;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public int idadeCarro(){
        return 2025 - ano;
    }


    public void ficha() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Cor: " + cor);


    }
}

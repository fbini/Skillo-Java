package br.com.screenMatch.Modelos;

import br.com.screenMatch.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setTotalVizualizacao(int totalVizualizacao) {
        this.totalVizualizacao = totalVizualizacao;
    }

    @Override
    public int getClassificacao() {
       if (totalVizualizacao > 100){
           return 4;
       } else {
           return 2;
       }
    }
}

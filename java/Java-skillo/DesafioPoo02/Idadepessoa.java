package DesafioPoo02;

public class Idadepessoa {
    private int idade;
    private String nome;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
       String resultado = idade < 18 ? "Menor de idade" : "Maior de idade";
        return resultado;
    }
}

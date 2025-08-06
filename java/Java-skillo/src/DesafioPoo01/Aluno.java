package DesafioPoo01;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void resultado(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);

    }
}

package DesafioPoo02;

public class Aluno {
    private String nome;
    private double notas;

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calculandoMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média do aluno " + nome + " é de " + media);
    }

}

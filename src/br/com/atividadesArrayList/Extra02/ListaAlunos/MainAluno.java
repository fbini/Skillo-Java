package br.com.atividadesArrayList.Extra02.ListaAlunos;

import java.util.ArrayList;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Ingrid Bini", 9.9);
        Aluno aluno02 = new Aluno("José", 5.5);
        Aluno aluno03 = new Aluno("Gabriel", 7.5);

        ArrayList<Aluno> listaAlunos=  new ArrayList<>();
        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);

        int soma = 0;
        int quantidade = 0;

        for (Aluno aluno : listaAlunos){
            soma = soma + aluno;
            quantidade++;
        }
        double media = (double) soma /quantidade;
    }
}

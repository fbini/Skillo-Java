package AplicacaoPoo.modelos;

import AplicacaoPoo.calculos.Classificavel;

// extends - palavra reservada que aplica herança á uma classe
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}

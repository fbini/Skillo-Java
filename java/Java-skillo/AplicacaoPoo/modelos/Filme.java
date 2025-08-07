package AplicacaoPoo.modelos;

// extends - palavra reservada que aplica herança á uma classe
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

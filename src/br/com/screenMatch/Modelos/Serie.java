package br.com.screenMatch.Modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epsPorTemporada;
    private boolean ativa;
    private int minutosPorEps;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEps() {
        return minutosPorEps;
    }

    public void setMinutosPorEps(int minutosPorEps) {
        this.minutosPorEps = minutosPorEps;
    }
    //Override - possibilita a sobrescrita de um metodo
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsPorTemporada * minutosPorEps;

    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}



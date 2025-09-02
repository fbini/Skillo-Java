package br.com.atividadesArrayList.DesafioExtra.Dvd;

public class Dvd {
    private String name;
    private int releaseYear;
    private String director;

    public Dvd(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", director='" + director + '\'' +
                '}';

    }
}

package br.com.atividadesArrayList.Extra02.ListaDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }
}

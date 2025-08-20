package br.com.aplicacaoMusicas.modelos;

public class MainMusica {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            musica.reproduz();
        }
        for (int i = 0; i < 50; i++){
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Ingrid Bini");

        for (int i = 0; i < 5000; i++ ){
            podcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}

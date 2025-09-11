package br.com.atividadesArrayList.HomeOffice.MovieList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMovies {
    public static void main(String[] args) {
        Movie movie01 = new Movie("Star Wars V","Ficção", 10);
        Movie movie02 = new Movie("Star Wars VIII", "Ficção", 2);
        Movie movie03 = new Movie("Star Wars III","Ficção", 10);

        ArrayList<Movie> movieList = new ArrayList<>(Arrays.asList(movie01, movie02, movie03));

        for (Movie movies : movieList){
            if (movies.getRating() >= 8){
                System.out.println("Maiores avaliações: " + movies.getRating());
            } else {
                System.out.println("Menor valiações: " + movies.getRating());
            }
        }

    }
}

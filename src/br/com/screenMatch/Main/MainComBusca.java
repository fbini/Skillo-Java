package br.com.screenMatch.Main;

import br.com.screenMatch.Modelos.Titulo;
import br.com.screenMatch.Modelos.TituloOmdb;
import br.com.screenMatch.execcao.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme ou uma Série para a busca: ");
        String busca = scanner.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=9025175";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            //try - tente = excepion de formato de numero

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido");
            System.out.println(meuTitulo);

        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca");

        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente");
    }
}

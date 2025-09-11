package br.com.atividadesArrayList.HomeOffice.ProductsList;

import java.util.ArrayList;

public class MainProducts {
    public static void main(String[] args) {
        Products productsBola = new Products("Bola", 29.99);
        Products productsBoneca = new Products("Boneca", 9.99);
        Products productsLivro = new Products("Livro",39.99);

        ArrayList<Products> listProducts = new ArrayList<>();
        listProducts.add(productsBola);
        listProducts.add(productsBoneca);
        listProducts.add(productsLivro);

        System.out.println(listProducts.size());
        System.out.println("Todos os produtos: " + listProducts.toString());
        /// maior valor
        Products highestPriced = listProducts.get(0);

        for (Products list : listProducts){
                if (list.getPrice() > highestPriced.getPrice()) {
                    highestPriced = list;
                }
        }
        System.out.println("O produto " + highestPriced.getName() + " tem o maior valor " + highestPriced.getPrice());






    }
}

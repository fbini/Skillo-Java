package br.com.atividadesArrayList.HomeOffice.ProductsList;

public class Products {
    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

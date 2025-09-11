package br.com.atividadesArrayList.HomeOffice.CarList;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

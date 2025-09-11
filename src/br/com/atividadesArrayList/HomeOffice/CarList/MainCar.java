package br.com.atividadesArrayList.HomeOffice.CarList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) {
        Car car01 = new Car("Miata",2000, "Vermelho");
        Car car02 = new Car("Toyota", 2019, "Branco");
        Car car03 = new Car("Fiat Mobi", 2001,"Rosa");
        Car car04 = new Car("Chevrolet", 2006,"Vermelho");

        ArrayList<Car> listDeCars = new ArrayList<>(Arrays.asList(car01, car02, car03, car04));

        for (Car car : listDeCars){
            if (car.getColor() == "Vermelho"){
                System.out.println(car);
            }
        }

    }
}

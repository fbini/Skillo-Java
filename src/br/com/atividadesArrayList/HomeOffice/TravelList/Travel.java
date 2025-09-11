package br.com.atividadesArrayList.HomeOffice.TravelList;

public class Travel {
    private String destination;
    private int lengthOfDays;


    public int getLengthOfDays() {
        return lengthOfDays;
    }

    public Travel(String destination, int lengthOfDays) {
        this.destination = destination;
        this.lengthOfDays = lengthOfDays;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "destination = '" + destination + '\'' +
                ", lengthOfDays = " + lengthOfDays +
                '}';
    }
}

package br.com.atividadesArrayList.HomeOffice.TravelList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTravel {
    public static void main(String[] args) {
        Travel travel01 = new Travel("Brazil", 8);
        Travel travel02 = new Travel("Australia", 5);
        Travel travel03 = new Travel("Mato Grosso do Sul", 3);
        Travel travel04 = new Travel("Rio Grande do Sul", 10);

        ArrayList<Travel> travelList = new ArrayList<>(Arrays.asList(travel01, travel02, travel03, travel04));

        for (Travel travel : travelList){
            if (travel.getLengthOfDays() > 7){
                System.out.println("Duram mais de 7 dias: " + travel);
            }
        }

    }
}

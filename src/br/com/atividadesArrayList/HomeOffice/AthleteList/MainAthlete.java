package br.com.atividadesArrayList.HomeOffice.AthleteList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainAthlete {
    public static void main(String[] args) {
        Athlete athlete01 = new Athlete("Ingrid", "Ginástica", 10);
        Athlete athlete02 = new Athlete("Mariana", "Judô", 9.9);
        Athlete athlete03 = new Athlete("José", "Corrida", 5.5);

        ArrayList<Athlete> athleteList = new ArrayList<>(Arrays.asList(athlete01, athlete02, athlete03));
        Athlete start = athleteList.get(0);

        for (Athlete athletes : athleteList){
            if (athletes.getScore() > start.getScore() ){
                start = athletes;
            }
        }
        System.out.println("Campeão: " + start.getName() + " com nota " + start.getScore());


    }
}

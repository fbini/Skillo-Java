package br.com.atividadesArrayList.HomeOffice.AthleteList;

public class Athlete {
    private String name;
    private String modality;
    private double score;

    public double getScore() {
        return score;
    }

    public Athlete(String name, String modality, double score) {
        this.name = name;
        this.modality = modality;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", score=" + score +
                '}';
    }
}

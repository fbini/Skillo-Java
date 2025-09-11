package br.com.atividadesArrayList.HomeOffice.RecipeList;

public class Recipe {
    private String name;
    private double preparationTime;

    public Recipe(String name, double preparationTime) {
        this.name = name;
        this.preparationTime = preparationTime;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", preparationTime=" + preparationTime +
                '}';
    }
}

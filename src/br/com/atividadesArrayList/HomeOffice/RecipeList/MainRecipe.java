package br.com.atividadesArrayList.HomeOffice.RecipeList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRecipe {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("Strognoffe", 40);
        Recipe recipe1 = new Recipe("Bolo de cenoura", 15);
        Recipe recipe2 = new Recipe("Pão", 20);

        ArrayList<Recipe> recipesList = new ArrayList<>(Arrays.asList(recipe, recipe1, recipe2));

        for (Recipe recipes : recipesList){
            if(recipes.getPreparationTime() < 30){
                System.out.println(recipes);
            }

        }

    }
}

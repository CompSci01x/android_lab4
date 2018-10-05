package ssu.tholland.androidlab4.utils;

import com.google.gson.Gson;

import java.util.List;

import ssu.tholland.androidlab4.model.RecipeModel;
import ssu.tholland.androidlab4.model.RecipeResponse;

public class RecipeParser {

    public static List<RecipeModel> recipesFromJson(String json) {
        Gson gson = new Gson();
        RecipeResponse response = gson.fromJson(json, RecipeResponse.class);
        List<RecipeModel> recipes = response.getRecipes();

        return recipes;
    }
}

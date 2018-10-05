package ssu.tholland.androidlab4.utils;

import com.google.gson.Gson;

import java.util.List;

import ssu.tholland.androidlab4.model.RecipeModel;
import ssu.tholland.androidlab4.model.RecipeResponse;

public class RecipeParser {

    public static List<RecipeModel> recipesFromJson(String json) {

        // 1. create a new Gson instance
        Gson gson = new Gson();

        // 2. parse the `json` response (into a RecipeResponse)
        RecipeResponse response = gson.fromJson(json, RecipeResponse.class);

        // 3. return a List of RecipeModel instead of `null`
        List<RecipeModel> recipes = response.getRecipes();

        return recipes;
    }
}

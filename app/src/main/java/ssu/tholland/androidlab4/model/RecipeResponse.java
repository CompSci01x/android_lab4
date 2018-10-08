package ssu.tholland.androidlab4.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeResponse {

    //private List<RecipeModel> recipes;
    @SerializedName("matches")
    private List<RecipeModel> recipes;

    public List<RecipeModel> getRecipes() {
        return recipes;
    }

//    public List<RecipeModel> getResponse() {
  //      return response;
   // }
}


// ******** SAMPLE RESPONSE FROM YUMMLY API ***********
// http://api.yummly.com/v1/api/recipes?_app_key=ec3e34e0bb6801670dbd3dbd02ce7608&_app_id=4911b643&q=eggs
/*
{
  "criteria": {
    "q": "lemon",
    "allowedIngredient": null,
    "excludedIngredient": null
  },
  "matches": [
    { ... },  // these objects are RecipeModels
    { ... },
    { ... },
    { ... },
    { ... }
  ],
  "facetCounts": { ... },
  "totalMatchCount": 247614,
  "attribution": { ... }
}

*/
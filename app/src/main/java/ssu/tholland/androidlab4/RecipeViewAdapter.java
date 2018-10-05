package ssu.tholland.androidlab4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ssu.tholland.androidlab4.model.RecipeModel;

public class RecipeViewAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    private List<RecipeModel> recipeCollection;

    public RecipeViewAdapter(List<RecipeModel> collection) {
        recipeCollection = collection;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.recycler_list_item, parent, false);
        return new RecipeViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder recipeViewHolder, int position) {
        //Get model at the specified position in the list
        RecipeModel model = recipeCollection.get(position);
        //put the data of the model in the viewHolder
        recipeViewHolder.bindView(model);
    }

    @Override
    public int getItemCount() {
        return recipeCollection.size();
    }
}

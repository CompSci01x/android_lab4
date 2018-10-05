package ssu.tholland.androidlab4;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import ssu.tholland.androidlab4.model.RecipeModel;

public class RecipeViewHolder extends RecyclerView.ViewHolder {

    private TextView itemNameTextView;
    private TextView itemRatingTextView;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        itemNameTextView = itemView.findViewById(R.id.recycler_item_name); //R is resource. Used for every android project. Used to access elements in .xml iles
        itemRatingTextView = itemView.findViewById(R.id.recycler_item_rating);
    }

    public void bindView(RecipeModel model) {
        //get recipeName form model and set it on itemNameTextView
        itemNameTextView.setText(model.getRecipeName());
        //get rating from the model and set it on itemRatingTextView
        itemRatingTextView.setText(String.format("Rating: %d / 5", model.getRating())); // (decimal) model.getRating() replaces %d
    }
}

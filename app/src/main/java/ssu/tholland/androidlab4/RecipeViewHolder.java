package ssu.tholland.androidlab4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ssu.tholland.androidlab4.model.RecipeModel;

public class RecipeViewHolder extends RecyclerView.ViewHolder {

    private TextView itemNameTextView;
    private TextView itemRatingTextView;

    public RecipeViewHolder(View itemView) {
        super(itemView);

    }

    public void bindView(RecipeModel model) {

    }
}

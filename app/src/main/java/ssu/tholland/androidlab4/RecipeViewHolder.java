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

        //not sure about this:
        itemView.findViewById(R.id.recycler_view);

    }

    public void bindView(RecipeModel model) {

        //not sure about this either:
        itemNameTextView.setText(model.getRecipeName());
        itemRatingTextView.setText(String.format("Rating: %i / 5",model.getTotalTimeInSeconds()));
    }
}

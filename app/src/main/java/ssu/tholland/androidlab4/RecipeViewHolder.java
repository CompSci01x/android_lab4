package ssu.tholland.androidlab4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ssu.tholland.androidlab4.model.RecipeModel;

public class RecipeViewHolder extends RecyclerView.ViewHolder {

    private TextView itemNameTextView;    // these two connect to recycler_list_item
    private TextView itemRatingTextView;   // layout   P2S13

    public RecipeViewHolder(View itemView) {
        super(itemView);

        // ADDED two vars P2S14

        itemNameTextView = itemView.findViewById(R.id.recycler_item_name);
        itemRatingTextView = itemView.findViewById(R.id.recycler_item_rating);

    }

    public void bindView(RecipeModel model) {

        itemNameTextView.setText("recipe name");                // LEFT OFFFFF
        String.format("Rating: %i / 5", itemRatingTextView);  // P2S15
    }
}

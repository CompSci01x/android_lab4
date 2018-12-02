package ssu.tholland.androidlab4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import ssu.tholland.androidlab4.model.RecipeModel;

public class RecipeViewHolder extends RecyclerView.ViewHolder {

    private TextView itemNameTextView;
    private TextView itemRatingTextView;
    private ImageView itemImageView;

    public RecipeViewHolder(View itemView) {
        super(itemView);

        itemNameTextView = itemView.findViewById(R.id.recycler_item_name);
        itemRatingTextView = itemView.findViewById(R.id.recycler_item_rating);
        itemImageView = itemView.findViewById(R.id.recipe_image);

    }

    public void bindView(RecipeModel model) {
        itemNameTextView.setText(model.getRecipeName());
        itemRatingTextView.setText(String.format("Rating: %d / 5", model.getRating()));
        Picasso.get()
                .load(model.getSmallImageUrls().get(0))
                .resize(50, 50)
                .into(itemImageView);
    }
}

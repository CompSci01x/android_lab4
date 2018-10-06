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
    private ImageView itemPicImageView;

    public RecipeViewHolder(View itemView) {
        super(itemView);

        itemNameTextView = itemView.findViewById(R.id.recycler_item_name);
        itemRatingTextView = itemView.findViewById(R.id.recycler_item_rating);
        itemPicImageView = itemView.findViewById(R.id.recycler_item_image);

    }

    public void bindView(RecipeModel model) {

        String recipeName = model.getRecipeName();
        int rating = model.getRating();

        itemNameTextView.setText(recipeName);
        itemRatingTextView.setText(String.format("Rating: %d / 5", rating));
        Picasso.get().load(model.getSmallImageUrls().get(0)).into(itemPicImageView); // load image into the image view

    }
}

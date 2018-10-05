package ssu.tholland.androidlab4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import ssu.tholland.androidlab4.model.RecipeModel;
import ssu.tholland.androidlab4.network.RecipeSearchAsyncTask;

public class RecyclerViewActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button searchButton;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        searchEditText = findViewById(R.id.search_edit_text);

        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(layoutManager);

        searchButton = findViewById(R.id.recipe_search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                task.setListener(new RecipeSearchAsyncTask.RecipeCallbackListener() {
                    @Override
                    public void onRecipeCallback(List<RecipeModel> models) {
                        RecipeViewAdapter adapter=new RecipeViewAdapter(models);
                        recyclerView.setAdapter(adapter);
                    }
                });
                task.execute(searchEditText.getText().toString());
            }
        });

    }
}

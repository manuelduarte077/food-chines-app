package com.hardsoftday.foodchines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.foodchines.adapter.PopularFoodAdapter;
import com.hardsoftday.foodchines.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Pizza Con Queso", "$12.5", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Float Cake Vietnan", "$25.5", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "$12.5", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Pizza Con Queso", "$12.5", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Float Cake Vietnan", "$25.5", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "$12.5", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Pizza Con Queso", "$12.5", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Float Cake Vietnan", "$25.5", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Chicken Drumstick", "$12.5", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.food_popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter =  new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

}
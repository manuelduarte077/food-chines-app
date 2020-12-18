package com.hardsoftday.foodchines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.foodchines.adapter.AsiaFoodAdapter;
import com.hardsoftday.foodchines.adapter.PopularFoodAdapter;
import com.hardsoftday.foodchines.model.AsiaFood;
import com.hardsoftday.foodchines.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         *  RecyclerView  Popular food
         */
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

        /**
         *  RecyclerView Asia Food
         */
        List<AsiaFood> asiaFoodList = new ArrayList<>();

        asiaFoodList.add(new AsiaFood("Bilwi Pizza", "$12", R.drawable.asiafood1, "4.9", "Friends Restorant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$15.5", R.drawable.asiafood2, "4.9", "Briands Restorant"));
        asiaFoodList.add(new AsiaFood("Bilwi Pizza", "$12", R.drawable.asiafood1, "4.9", "Friends Restorant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$15.5", R.drawable.asiafood2, "4.9", "Briands Restorant"));
        asiaFoodList.add(new AsiaFood("Bilwi Pizza", "$12", R.drawable.asiafood1, "4.9", "Friends Restorant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$15.5", R.drawable.asiafood2, "4.9", "Briands Restorant"));
        asiaFoodList.add(new AsiaFood("Bilwi Pizza", "$12", R.drawable.asiafood1, "4.9", "Friends Restorant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$15.5", R.drawable.asiafood2, "4.9", "Briands Restorant"));

        setAsiaRecycler(asiaFoodList);

    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {
        popularRecycler = findViewById(R.id.food_popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter =  new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {
        asiaRecycler = findViewById(R.id.asia_food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);
    }

}
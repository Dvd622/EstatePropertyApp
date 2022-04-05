package com.example.realestateapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Property> propertyList = new ArrayList<>();
    Integer[] images = {R.drawable.property_image1, R.drawable.property_image2};
    String [] address = {"Burwood", "Boxhill"};
    String [] rent = {"500 per week", "600 per week"};
    String [] bed = {"2 bed", "3 bed"};
    String [] bath = {"2 bath", "2 bath"};
    String [] car = {"1 car", "2 car"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.propertyRecyclerView);
        for (int i = 0; i < images.length; i++) {
            propertyList.add(new Property(images[i], address[i], bed[i], bath[i], car[i], rent[i]));
        }
        PropertyAdapter propertyAdapter = new PropertyAdapter(getApplicationContext(), propertyList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(propertyAdapter);
    }
}
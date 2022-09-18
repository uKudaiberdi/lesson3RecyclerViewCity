package com.example.lesson3recyclerviewcity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> cityList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> city = new ArrayList<>();
        cityList.add("Chui");
        cityList.add("Osh");
        cityList.add("Batken");
        cityList.add("Naryn");
        cityList.add("Jalal-Abad");
        cityList.add("Issyk-Kol");
        cityList.add("Talas");
        cityList.add("Tura");
        cityList.add("Omsk");
        cityList.add("Tomsk");
        cityList.add("Ukhta");
        cityList.add("Kotlas");
        cityList.add("Syktyvkar");
        cityList.add("Kirov");
        cityList.add("Kazan");
        cityList.add("Perm");
        cityList.add("Serov");
        cityList.add("Tver");
        cityList.add("Orel");
        cityList.add("Voronezh");

        CityAdapter adapter = new CityAdapter(cityList);
        recyclerView.setAdapter(adapter);
    }
}
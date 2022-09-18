package com.example.lesson3recyclerviewcity;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_city;

    public CityViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_city = itemView.findViewById(R.id.tv_city);
    }

    public void bind (String city){
        tv_city.setText(city);
    }
}

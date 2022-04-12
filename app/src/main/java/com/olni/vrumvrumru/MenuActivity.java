package com.olni.vrumvrumru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void GoToAddingCars(View view) {
        startActivity(new Intent(MenuActivity.this, AddingCarsActivity.class));
    }

    public void GoToCarsList(View view) {
        startActivity(new Intent(MenuActivity.this, CarsReviewActivity.class));
    }
}

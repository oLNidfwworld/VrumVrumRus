package com.olni.vrumvrumru;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;


public class AddingCarsActivity  extends AppCompatActivity  {

    EditText Name,Color,Year,Price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_cars_activity);
    }

    public void AddCar(View view) {

        Name = findViewById(R.id.CarNameEditText);
        Color = findViewById(R.id.CarColorEditText);
        Year = findViewById(R.id.CarYearEditText);
        Price = findViewById(R.id.CarPriceEditText);
        if(Name.getText().toString().isEmpty()
                ||
                Color.getText().toString().isEmpty()
                ||
                Year.getText().toString().isEmpty()
                ||
                Price.getText().toString().isEmpty()){

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Some fields is empty", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            DataModel model = new DataModel(Name.getText().toString(),Price.getText().toString(),Year.getText().toString(),Color.getText().toString());
            data.Add(model);

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Successfully added", Toast.LENGTH_SHORT);
            toast.show();

        }
    }

    public void Back(View view) {
        startActivity(new Intent(AddingCarsActivity.this, MenuActivity.class));
    }
}

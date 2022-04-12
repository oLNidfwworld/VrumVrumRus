package com.olni.vrumvrumru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsReviewActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_review);

        text = findViewById(R.id.textView6);

        String datastring = "";

        for (DataModel item:
             data.dataModelList) {
            String S="Model: " + item.Name +"\n"
                    +"Price: "+ item.Price +"\n"
                    +"Year of release: " + "\n"
                    +"Color: "+item.Color + "\n\n";
            datastring += S;
        }

        text.setText(datastring);

    }

    public void Back(View view) {startActivity(new Intent(CarsReviewActivity.this, MenuActivity.class));

    }
}

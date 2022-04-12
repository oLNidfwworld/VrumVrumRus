package com.olni.vrumvrumru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText login;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.LoginEditText);
        password = findViewById(R.id.PasswordEditText);
    }

    public void LogIn(View view) {
        if(login.getText().toString().equals("admin") && password.getText().toString().equals("admin")){

            startActivity(new Intent(MainActivity.this, MenuActivity.class));
        }
        else{

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Invalid login or/and password", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
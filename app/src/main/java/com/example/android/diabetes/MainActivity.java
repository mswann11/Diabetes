package com.example.android.diabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

    public void myth(View view) {
        Intent intent = new Intent(this, Myth.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);
    }

    public void bmi(View view) {
        Intent intent = new Intent(this, Bmi.class);
        startActivity(intent);
    }

    public void screening(View view) {
        Intent intent = new Intent(this, Screening.class);
        startActivity(intent);
    }

}
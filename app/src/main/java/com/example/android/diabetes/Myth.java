package com.example.android.diabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Myth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void myth_start(View view) {
        setContentView(R.layout.activity_myth1);
    }

    public void myth_2(View view) {
        setContentView(R.layout.activity_myth2);
    }

    public void myth_3(View view) {
        setContentView(R.layout.activity_myth3);
    }

    public void myth_4(View view) {
        setContentView(R.layout.activity_myth4);
    }

    public void myth_5(View view) {
        setContentView(R.layout.activity_myth5);
    }
}

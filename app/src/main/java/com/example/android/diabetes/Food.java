package com.example.android.diabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Spinner vegetableSpinner = (Spinner) findViewById(R.id.vegetable_spinner);
        ArrayAdapter<CharSequence> vegetableAdapter = ArrayAdapter.createFromResource(this,
                R.array.vegetable_array, R.layout.spinner_item);
        vegetableAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        vegetableSpinner.setAdapter(vegetableAdapter);

        Spinner proteinSpinner = (Spinner) findViewById(R.id.protein_spinner);
        ArrayAdapter<CharSequence> proteinAdapter = ArrayAdapter.createFromResource(this,
                R.array.protein_array, R.layout.spinner_item);
        proteinAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        proteinSpinner.setAdapter(proteinAdapter);

        Spinner grainSpinner = (Spinner) findViewById(R.id.grain_spinner);
        ArrayAdapter<CharSequence> grainAdapter = ArrayAdapter.createFromResource(this,
                R.array.grain_array, R.layout.spinner_item);
        grainAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        grainSpinner.setAdapter(grainAdapter);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

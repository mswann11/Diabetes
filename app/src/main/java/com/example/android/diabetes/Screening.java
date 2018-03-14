package com.example.android.diabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Screening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screening);
        Spinner ageSpinner = (Spinner) findViewById(R.id.age_spinner);
        ArrayAdapter<CharSequence> ageAdapter = ArrayAdapter.createFromResource(this,
                R.array.age_array, android.R.layout.simple_spinner_item);
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(ageAdapter);

        Spinner sexSpinner = (Spinner) findViewById(R.id.sex_spinner);
        ArrayAdapter<CharSequence> sexAdapter = ArrayAdapter.createFromResource(this,
                R.array.sex_array, android.R.layout.simple_spinner_item);
        sexAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexSpinner.setAdapter(sexAdapter);

        Spinner gestationalSpinner = (Spinner) findViewById(R.id.gestational_spinner);
        ArrayAdapter<CharSequence> gestationalAdapter = ArrayAdapter.createFromResource(this,
                R.array.gestational_array, android.R.layout.simple_spinner_item);
        gestationalAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gestationalSpinner.setAdapter(gestationalAdapter);

        Spinner relativeSpinner = (Spinner) findViewById(R.id.relative_spinner);
        ArrayAdapter<CharSequence> relativeAdapter = ArrayAdapter.createFromResource(this,
                R.array.relative_array, android.R.layout.simple_spinner_item);
        relativeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        relativeSpinner.setAdapter(relativeAdapter);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

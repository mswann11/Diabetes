package com.example.android.diabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz extends MainActivity {
    boolean question1IsCorrect;
    boolean question2IsCorrect;
    boolean question3IsCorrect;
    boolean question4IsCorrect;
    boolean question5IsCorrect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void checkQuestion1 () {
        RadioButton option1 = (RadioButton) findViewById(R.id.q1_o1);
        boolean q1O1 = option1.isChecked();
        if(q1O1){
            question1IsCorrect = true;
        }
        else{
            question1IsCorrect = false;
        }
    }

    private void checkQuestion2 () {
        RadioButton option3 = (RadioButton) findViewById(R.id.q2_o3);
        boolean q2O3 = option3.isChecked();
        if(q2O3){
            question2IsCorrect = true;
        }
        else{
            question2IsCorrect = false;
        }
    }

    private void checkQuestion3 () {
        CheckBox option1 = (CheckBox) findViewById(R.id.q3_o1);
        CheckBox option2 = (CheckBox) findViewById(R.id.q3_o2);
        CheckBox option3 = (CheckBox) findViewById(R.id.q3_o3);
        CheckBox option4 = (CheckBox) findViewById(R.id.q3_o4);
        CheckBox option5 = (CheckBox) findViewById(R.id.q3_o5);
        boolean q3O1 = option1.isChecked();
        boolean q3O2 = option2.isChecked();
        boolean q3O3 = option3.isChecked();
        boolean q3O4 = option4.isChecked();
        boolean q3O5 = option5.isChecked();
        if(q3O1 && !q3O2 && q3O3 && q3O4 && !q3O5){
            question3IsCorrect = true;
        }
        else{
            question3IsCorrect = false;
        }
    }

    private void checkQuestion4 () {
        RadioButton option2 = (RadioButton) findViewById(R.id.q4_o2);
        boolean q4O2 = option2.isChecked();
        if(q4O2){
            question4IsCorrect = true;
        }
        else{
            question4IsCorrect = false;
        }
    }

    private void checkQuestion5 () {
        CheckBox option1 = (CheckBox) findViewById(R.id.q5_o1);
        CheckBox option2 = (CheckBox) findViewById(R.id.q5_o2);
        CheckBox option3 = (CheckBox) findViewById(R.id.q5_o3);
        CheckBox option4 = (CheckBox) findViewById(R.id.q5_o4);
        CheckBox option5 = (CheckBox) findViewById(R.id.q5_o5);
        boolean q5O1 = option1.isChecked();
        boolean q5O2 = option2.isChecked();
        boolean q5O3 = option3.isChecked();
        boolean q5O4 = option4.isChecked();
        boolean q5O5 = option5.isChecked();
        if(q5O1 && q5O2 && q5O3 && q5O4 && q5O5){
            question5IsCorrect = true;
        }
        else{
            question5IsCorrect = false;
        }
    }

    public void checkAnswers(View view) {
        Button button = (Button) findViewById(R.id.show);
        button.setVisibility(View.VISIBLE);
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        int percentCorrect=0;
        boolean answers[] = {question1IsCorrect, question2IsCorrect, question3IsCorrect, question4IsCorrect, question5IsCorrect};
        for(int i=0; i<5; i++){
            if(answers[i]){
                percentCorrect+=20;
            }
        }
        if (question1IsCorrect && question2IsCorrect && question3IsCorrect && question4IsCorrect && question5IsCorrect) {
            CharSequence text = "You got 100%! All answers are correct!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }
        else {
            CharSequence text = "You got " + percentCorrect + "% correct! Try these questions again:\n";
            if(!question1IsCorrect){
                text += "\nQuestion 1";
            }
            if(!question2IsCorrect){
                text += "\nQuestion 2";
            }
            if (!question3IsCorrect) {
                text += "\nQuestion 3";
            }
            if(!question4IsCorrect){
                text += "\nQuestion 4";
            }
            if(!question5IsCorrect){
                text += "\nQuestion 5";
            }
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void showAnswers(View view){
        setContentView(R.layout.activity_answers);
    }
}

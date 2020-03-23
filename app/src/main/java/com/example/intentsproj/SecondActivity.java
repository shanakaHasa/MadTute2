package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int ac1Value1;
    private int ac1Value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_acvtivity);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        ac1Value1 = extras.getInt("Num1");
        ac1Value2 = extras.getInt("Num2");

        TextView textNo1 = findViewById(R.id.no1);
        textNo1.setText(Integer.toString(ac1Value1));

        TextView textNo2= findViewById(R.id.no2);
        textNo2.setText(Integer.toString(ac1Value2));
    }

    public void Addition(View view) {
        int ans = ac1Value1 +  ac1Value2;

        TextView txtAnswer = findViewById(R.id.answer);
        txtAnswer.setText(Integer.toString(ac1Value1) + " + " + Integer.toString(ac1Value2) + " = " + Integer.toString(ans));
    }

    public void subtractions(View view) {
        int ans = ac1Value1 -  ac1Value2;

        TextView txtAnswer = findViewById(R.id.answer);
        txtAnswer.setText(Integer.toString(ac1Value1) + " - " + Integer.toString(ac1Value2) + " = " + Integer.toString(ans));
    }

    public void multiplication(View view) {
        int ans = ac1Value1 *  ac1Value2;

        TextView txtAnswer = findViewById(R.id.answer);
        txtAnswer.setText(Integer.toString(ac1Value1) + " * " + Integer.toString(ac1Value2) + " = " + Integer.toString(ans));
    }

    public void division(View view) {
        int ans = ac1Value1 /  ac1Value2;

        TextView txtAnswer = findViewById(R.id.answer);
        txtAnswer .setText(Integer.toString(ac1Value1) + " / " + Integer.toString(ac1Value2) + " = " + Integer.toString(ans));
    }
}

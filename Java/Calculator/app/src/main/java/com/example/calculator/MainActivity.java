package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultText = findViewById(R.id.textView1);
    }

    public void addition(View view) {

        if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            System.out.println("Field(s) empty!");
        }
        else {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (num1+num2));
        }
    }

    public void subtraction(View view) {

        if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            System.out.println("Field(s) empty!");
        }
        else {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (num1-num2));
        }
    }

    public void multiplication(View view) {

        if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            System.out.println("Field(s) empty!");
        }
        else {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (num1*num2));
        }
    }

    public void division(View view) {

        if(editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            System.out.println("Field(s) empty!");
        }
        else {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (num1/num2));
        }
    }
}

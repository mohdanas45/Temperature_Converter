package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;
    private TextView result;
    private EditText enterTemp;
    double result0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enterTemp=findViewById(R.id.EnterTemp);
        result=findViewById(R.id.result);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp * 1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}
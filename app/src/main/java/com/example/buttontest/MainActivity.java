package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button xmlBtn, javaBtn, interfaceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xmlBtn = findViewById(R.id.xmlBtn);
        javaBtn = findViewById(R.id.javaBtn);
        interfaceBtn = findViewById(R.id.interfaceBtn);

        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xmlBtn.setTextColor(Color.BLACK);
                javaBtn.setTextColor(Color.RED);
                interfaceBtn.setTextColor(Color.BLACK);

                Toast.makeText(getApplicationContext(), "Java Button", Toast.LENGTH_LONG).show();
            }
        });

        interfaceBtn.setOnClickListener(this);
    }

    public void clickXmlButton(View view) {
        xmlBtn.setTextColor(Color.RED);
        javaBtn.setTextColor(Color.BLACK);
        interfaceBtn.setTextColor(Color.BLACK);

        Toast.makeText(getApplicationContext(), "XML Button", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view) {
        xmlBtn.setTextColor(Color.BLACK);
        javaBtn.setTextColor(Color.BLACK);
        interfaceBtn.setTextColor(Color.RED);

        Toast.makeText(getApplicationContext(), "Interface Button", Toast.LENGTH_LONG).show();
    }
}

package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button javaBtn, interfaceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        javaBtn = findViewById(R.id.javaBtn);
        interfaceBtn = findViewById(R.id.interfaceBtn);

        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Java Button", Toast.LENGTH_LONG).show();
            }
        });

        interfaceBtn.setOnClickListener(this);
    }

    public void clickXmlButton(View view) {
        Toast.makeText(getApplicationContext(), "XML Button", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Interface Button", Toast.LENGTH_LONG).show();
    }
}

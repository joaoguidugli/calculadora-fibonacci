package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EmptyStackException;
import java.util.Stack;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button pilhaButton = findViewById(R.id.button2);
        final Button fibonacciButton = findViewById(R.id.button);

        Intent pilhaTela = new Intent(this, PilhaActivity.class);
        Intent fibonacciTela = new Intent(this, FibonacciActivity.class);

        pilhaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(pilhaTela);
            }
        });

        fibonacciButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(fibonacciTela);
            }
        });
    }
}


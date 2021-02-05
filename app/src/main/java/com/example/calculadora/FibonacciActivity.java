package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        final Button calcularButton = findViewById(R.id.button9);

        EditText numeroEditText = findViewById(R.id.editTextNumber2);
        TextView elementoTextView = findViewById(R.id.textView7);
        TextView tituloTextView = findViewById(R.id.textView5);

        ColorStateList lightColor =  tituloTextView.getTextColors();

        calcularButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int numP = Integer.parseInt(String.valueOf(numeroEditText.getText()));
                    numeroEditText.setText("");

                    int numA = 1;
                    int numB = 0;
                    int numC = 0;

                    for (int i = 1; i < numP; i++) {
                        numC = numA + numB;
                        numB = numA;
                        numA = numC;
                    }

                    String numero = String.valueOf(numB);
                    elementoTextView.setText(numero);

                    String aviso = String.valueOf("Fibonacci");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (NumberFormatException e) {
                    String aviso = String.valueOf("Operação inválida, digite um valor.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });
    }
}
package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EmptyStackException;
import java.util.Stack;

public class PilhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilha);

        Stack<Integer> stack1 = new Stack<Integer>();

        final Button empilharButton = findViewById(R.id.button5);
        final Button desempilharButton = findViewById(R.id.button7);
        final Button limparButton = findViewById(R.id.button6);
        final Button somaButton = findViewById(R.id.button);
        final Button menosButton = findViewById(R.id.button2);
        final Button divisaoButton = findViewById(R.id.button3);
        final Button multiplicacaoButton = findViewById(R.id.button4);

        EditText numeroEditText = findViewById(R.id.editTextNumber);
        TextView pilhaTextView = findViewById(R.id.textView4);
        TextView tituloTextView = findViewById(R.id.textView2);

        ColorStateList lightColor =  tituloTextView.getTextColors();

        empilharButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int numero = Integer.parseInt(String.valueOf(numeroEditText.getText()));
                    stack1.push(numero);
                    numeroEditText.setText("");

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (NumberFormatException e) {
                    String aviso = String.valueOf("Operação inválida, digite um valor.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        desempilharButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    String numero = String.valueOf(stack1.pop());
                    numeroEditText.setText(numero);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Operação inválida, a pilha está vazia.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        limparButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroEditText.setText("");
                stack1.clear();

                String pilha = String.valueOf(stack1);
                pilhaTextView.setText(pilha);
            }
        });

        somaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 + fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Operação inválida, a pilha não tem 2 números.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        menosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 - fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Operação inválida, a pilha não tem 2 números.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        divisaoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 / fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Operação inválida, a pilha não tem 2 números.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });

        multiplicacaoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int fator1 = stack1.pop();
                    int fator2 = stack1.pop();
                    stack1.push(fator1 * fator2);

                    String pilha = String.valueOf(stack1);
                    pilhaTextView.setText(pilha);

                    String aviso = String.valueOf("Calculadora");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(lightColor);
                } catch (EmptyStackException e) {
                    String aviso = String.valueOf("Operação inválida, a pilha não tem 2 números.");
                    tituloTextView.setText(aviso);
                    tituloTextView.setTextColor(getResources().getColor(R.color.design_default_color_error));
                }
            }
        });
    }
}
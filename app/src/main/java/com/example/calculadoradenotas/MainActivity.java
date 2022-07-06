package com.example.calculadoradenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText recebeMedia;
    private EditText recebeN1;
    private EditText recebeN2;
    private EditText recebeN3;
    private EditText recebeN4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recebeMedia = findViewById(R.id.recebeMediaInst);
        recebeN1 = findViewById(R.id.recebeN1);
        recebeN2 = findViewById(R.id.recebeN2);
        recebeN3 = findViewById(R.id.recebeN3);
        recebeN4 = findViewById(R.id.recebeN4);
    }

    public void calcularTudo(View view) {
        float nota1 = Float.parseFloat(recebeN1.getText().toString());
        float nota2 = Float.parseFloat(recebeN2.getText().toString());
        float nota3 = Float.parseFloat(recebeN3.getText().toString());
        float nota4 = Float.parseFloat(recebeN4.getText().toString());
        float mediaColetada = Float.parseFloat(recebeMedia.getText().toString());

        TextView text = findViewById(R.id.resultadoFinal);

        float mediaCalculada = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaCalculada >= mediaColetada) {
            text.setText("Sua média foi " + mediaCalculada + ". Você está aprovado!");
        } else {
            text.setText("Sua média foi " + mediaCalculada + ". Você está reprovado!");
        }
    }
}
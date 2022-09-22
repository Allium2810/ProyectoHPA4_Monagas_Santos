package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultados extends AppCompatActivity {

    Button btnvolver;
    TextView tvResultadoVivian, tvResultadoOmar, tvResultadoMartin, tvp1, tvp2, tvp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        Data.tvoto= Data.martin + Data.vivian + Data.omar;
       double pviv = ((Data.vivian*1.00)/Data.tvoto)*100.00;
       double pomar = ((Data.omar*1.00)/Data.tvoto)*100.00;
       double pmart = ((Data.martin*1.00)/Data.tvoto)*100.00;

        btnvolver=findViewById(R.id.btnvolver);
        tvResultadoVivian = findViewById(R.id.tvResultadoVivian);
        tvResultadoOmar = findViewById(R.id.tvResultadoOmar);
        tvResultadoMartin = findViewById(R.id.tvResultadoMartin);

        tvp1=findViewById(R.id.tvp1);
        tvp2=findViewById(R.id.tvp2);
        tvp3=findViewById(R.id.tvp3);

        tvResultadoVivian.setText("Vivían Valenzuela posee " +Data.vivian + " votos.");
        tvp1.setText("Porcentaje de votacion: " + pviv + "%");
        tvResultadoOmar.setText("Omar Aizpurua posee " + Data.omar + " votos.");
        tvp2.setText("Porcentaje de votacion: " + pomar + "%");
        tvResultadoMartin.setText("Martín Candanedo posee " +Data.martin + " votos.");
        tvp3.setText("Porcentaje de votación: " + pmart + "%");



        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(getApplicationContext(), opciones.class);
                startActivity(volver);
            }
        });
    }



}
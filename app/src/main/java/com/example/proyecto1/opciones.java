package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class opciones extends AppCompatActivity {
    Button opvotar, opres, opsalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        opvotar=findViewById(R.id.opvotar);
        opres=findViewById(R.id.opres);
        opsalir=findViewById(R.id.opsalir);



        opvotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            int elemento = Data.valida.get(Data.posicion);
                if (elemento == 1) {
                    Toast toast=Toast.makeText(getApplicationContext(),"No puede votar dos veces.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if (elemento == 0) {
                    Intent voto = new Intent(getApplicationContext(), votar.class);
                    startActivity(voto);
                }
            }
        });

        opres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int elemento = Data.valida.get(Data.posicion);

                if (elemento == 0) {
                    Toast toast=Toast.makeText(getApplicationContext(),"Necesita votar primero.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if (elemento == 1) {
                    Intent result = new Intent(getApplicationContext(), resultados.class);
                    startActivity(result);
                }

            }
        });
        opsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent salir = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(salir);
            }
        });

    }
}
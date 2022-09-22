package com.example.proyecto1;

import static com.example.proyecto1.Data.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class votar extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton rb1, rb2, rb3;
    Button btnvotar;
    ImageView imgrota;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votar);
        btnvotar=findViewById(R.id.btnvotar);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rg1=findViewById(R.id.rg1);
        imgrota=findViewById(R.id.imgrota);


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgrota.setImageResource(R.drawable.vivian);
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgrota.setImageResource(R.drawable.omar);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgrota.setImageResource(R.drawable.martin);
            }
        });


        btnvotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (rb1.isChecked()==true) {
                    vivian +=1;
                    Data.valida.set(Data.posicion, 1);
                }
                else if (rb2.isChecked()==true) {
                    omar +=1;
                    Data.valida.set(Data.posicion, 1);
                }
                else if (rb3.isChecked()==true) {
                    martin +=1;
                    Data.valida.set(Data.posicion, 1);
                }
                else {
                    Toast toast=Toast.makeText(getApplicationContext(),"No hay ninguna opción seleccionada",Toast.LENGTH_SHORT);
                    toast.show();

                }


                Intent votado = new Intent(getApplicationContext(), opciones.class);
                startActivity(votado);
            }
        });



    }
}
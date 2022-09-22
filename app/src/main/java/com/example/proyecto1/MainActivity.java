package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.*;



public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText etcedula, etnombre;
    RadioButton rbh, rbm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        etcedula=findViewById(R.id.etcedula);
       // etnombre=findViewById(R.id.etnombre);
       // rbh=findViewById(R.id.rbh);
       // rbm=findViewById(R.id.rbm);

        //Introduccion de cedulas en arreglo
        Data.cedula.add("08-0944-000327");
        Data.cedula.add("03-0740-001394");
        Data.cedula.add("20-0053-004282");
        Data.cedula.add("08-0943-001867");
        Data.cedula.add("08-0937-000503");
        Data.cedula.add("08-0952-002444");
        Data.cedula.add("08-0943-000012");
        Data.cedula.add("08-0986-000549");
        Data.cedula.add("08-0957-001827");
        Data.cedula.add("08-0940-001311");
        Data.cedula.add("08-0863-001620");
        Data.cedula.add("08-0964-000691");
        Data.cedula.add("08-0954-001126");
        Data.cedula.add("08-1039-001537");
        Data.cedula.add("08-0925-001168");
        Data.cedula.add("08-0940-001505");
        Data.cedula.add("08-0938-000925");
        Data.cedula.add("03-0743-002493");
        Data.cedula.add("0E-0008-169755");
        Data.cedula.add("08-0971-001811");
        Data.cedula.add("08-0940-000408");
        Data.cedula.add("08-0937-001640");
        Data.cedula.add("08-0939-001578");
        Data.cedula.add("08-0942-001406");
        Data.cedula.add("06-0722-000724");
        Data.cedula.add("08-0941-001215");
        Data.cedula.add("08-0962-001218");
        Data.cedula.add("08-0941-000924");
        Data.cedula.add("08-0980-002414");
        Data.cedula.add("03-0742-002055");
        Data.cedula.add("08-0942-001192");
        Data.cedula.add("08-0904-001189");
        Data.cedula.add("08-0959-000857");
        Data.cedula.add("08-0964-001554");
        Data.cedula.add("08-1066-001018");
        Data.cedula.add("08-1055-000701");
        Data.cedula.add("08-0970-000242");
        Data.cedula.add("03-0752-001461");
        Data.cedula.add("03-0745-000950");

        //Introduccion de nombres en arreglo
        Data.nombre.add("EDWIN ARROCHA");
        Data.nombre.add("MICHELLE BRENES");
        Data.nombre.add("EDDY BUSTAMANTE");
        Data.nombre.add("ALEJANDRA CABALLERO");
        Data.nombre.add("GABRIEL CHIARI");
        Data.nombre.add("KEVIN CORONADO");
        Data.nombre.add("LUIS DELGADO");
        Data.nombre.add("MARC DUDLEY");
        Data.nombre.add("DIEGO FERNANDEZ");
        Data.nombre.add("MARÍA FLORES");
        Data.nombre.add("DONALDO FRAZER");
        Data.nombre.add("MIGUEL GASCÓN");
        Data.nombre.add("ANDREW GONZALEZ");
        Data.nombre.add("VALERIE HERNÁNDEZ");
        Data.nombre.add("TOMMY HO");
        Data.nombre.add("JEAN JIMÉNEZ");
        Data.nombre.add("FELIPE LOO");
        Data.nombre.add("LISSETH MCDONALD");
        Data.nombre.add("JESUS MONAGAS");
        Data.nombre.add("DIANA MORENO");
        Data.nombre.add("GERARDO MORENO");
        Data.nombre.add("JUAN NAVARRO");
        Data.nombre.add("JULIO NAVAS");
        Data.nombre.add("ANEL PINZÓN");
        Data.nombre.add("JANIEL PINZÓN");
        Data.nombre.add("ANTONIO QIU");
        Data.nombre.add("CARLOS RICORD");
        Data.nombre.add("DAVID RIOS");
        Data.nombre.add("SERGIO RODRIGUEZ");
        Data.nombre.add("ZULIXA SALAS");
        Data.nombre.add("LUIS SAMANIEGO");
        Data.nombre.add("ARY SÁNCHEZ");
        Data.nombre.add("DIONISIO SANTOS");
        Data.nombre.add("BRYAN THOMAS");
        Data.nombre.add("CARLOS TUÑÓN");
        Data.nombre.add("GENESIS VITALE");
        Data.nombre.add("FERNANDO ZENG");
        Data.nombre.add("CARLOS ZHONG");
        Data.nombre.add("EIMY GUERRA");

        //Inicializacion de valida
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);

        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);

        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);

        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);
        Data.valida.add(0);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ced = String.valueOf(etcedula.getText().toString());
                //  String nom = String.valueOf(etnombre.getText().toString());

                    if (Data.cedula.contains(ced) /*&& Data.nombre.contains(nom)*/){
                        Data.posicion = Data.cedula.indexOf(ced);

                      /*  if (rbh.isChecked()==true){
                            Data.hombre+=1;
                        }
                        else if (rbm.isChecked()==true){
                            Data.mujer+=1;
                        }*/

                        Toast toast=Toast.makeText(getApplicationContext(),"Bienvenido al sistema, " + Data.nombre.get(Data.posicion),Toast.LENGTH_SHORT);
                        toast.show();

                        Intent opcion = new Intent(getApplicationContext(), opciones.class);
                        startActivity(opcion);

                    }
                    else if (Data.cedula.contains(ced)==false){
                        Toast toast=Toast.makeText(getApplicationContext(),"Cédula Inválida",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                   /* else if (Data.nombre.contains(nom)==false){
                        Toast toast=Toast.makeText(getApplicationContext(),"Nombre Inválido",Toast.LENGTH_SHORT);
                        toast.show();
                    }*/



            }
        });

    }
}
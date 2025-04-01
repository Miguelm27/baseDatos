package com.miguel.bd.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.miguel.bd.R;
import com.miguel.bd.model.Ciudad;
import com.miguel.bd.model.ManagerDb;

public class Ciudades extends AppCompatActivity {
    Button btn_insert_ciudad;
    EditText txt_name_city;
    ManagerDb managerDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);

        btn_insert_ciudad = findViewById(R.id.btn_insert_city);
        txt_name_city=findViewById(R.id.txt_name_city);

        Ciudad ciudad = new Ciudad(txt_name_city.getText().toString());


        btn_insert_ciudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long rest = managerDb.insertCity(ciudad);
                if(rest > 0){
                    Toast.makeText(Ciudades.this, "Ciudad agregada", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Ciudades.this, "No se pudo agregar la ciudad", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });

    }

}
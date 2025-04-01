package com.miguel.bd.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.miguel.bd.R;
import com.miguel.bd.model.Date;
import com.miguel.bd.model.ManagerDb;

public class Datos extends AppCompatActivity {
    EditText txt_name_date, txt_lastname_date, txt_location_date, txt_id_city;
    Button btn_insert_date;
    ManagerDb managerDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_datos);

        txt_name_date=findViewById(R.id.txt_name_date);
        txt_lastname_date=findViewById(R.id.txt_lastname_date);
        txt_location_date=findViewById(R.id.txt_location_date);
        txt_id_city=findViewById(R.id.txt_id_city);
        btn_insert_date=findViewById(R.id.btn_insert_date);
        String ciudadStr = txt_id_city.getText().toString().trim();
        int ciudad = ciudadStr.isEmpty()? 0 : Integer.parseInt(ciudadStr);

        Date date = new Date(txt_name_date.getText().toString(), txt_lastname_date.getText().toString(), txt_location_date.getText().toString(), ciudad);

        btn_insert_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long rest = managerDb.insertDate(date);
                if(rest > 0){
                    Toast.makeText(Datos.this, "Datos agregadados", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Datos.this, "No se pudo agregar los datos", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });

    }
}
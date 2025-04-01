package com.miguel.bd.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.miguel.bd.R;
import com.miguel.bd.model.ManagerDb;
import com.miguel.bd.model.Usuario;

public class Usuarios extends AppCompatActivity {
    Button btn_insert_user;
    EditText txt_name_user;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        managerDb = new ManagerDb(this);

        btn_insert_user = findViewById(R.id.btn_insert_user);
        txt_name_user = findViewById(R.id.txt_name_user);

        btn_insert_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txt_name_user.getText().toString();
                if (!nombre.isEmpty()) {
                    long res = managerDb.insertUser(new Usuario(nombre));
                    if (res > 0) {
                        Toast.makeText(Usuarios.this, "Usuario agregado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Usuarios.this, "Error al agregar usuario", Toast.LENGTH_SHORT).show();
                    }
                    finish();
                } else {
                    Toast.makeText(Usuarios.this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}





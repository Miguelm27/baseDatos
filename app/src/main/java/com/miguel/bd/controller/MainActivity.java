package com.miguel.bd.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.miguel.bd.R;
import com.miguel.bd.model.ManagerDb;
import com.miguel.bd.model.Usuario;

public class MainActivity extends AppCompatActivity {
    Button btn_agregar_ciudad, btn_agregar_dato, btn_agregar_usuario;
    ManagerDb managerDb;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        managerDb = new ManagerDb(this);

        // Verificar si la base de datos se crea correctamente
        long res = managerDb.insertUser(new Usuario("UsuarioPrueba"));
        if (res > 0) {
            Toast.makeText(this, "Base de datos lista", Toast.LENGTH_SHORT).show();
        }

        btn_agregar_ciudad = findViewById(R.id.btn_agregar_ciudad);
        btn_agregar_dato = findViewById(R.id.btn_agregar_dato);
        btn_agregar_usuario = findViewById(R.id.btn_agregar_usuario);

        btn_agregar_ciudad.setOnClickListener(v -> {
            Intent ir_ciudad = new Intent(MainActivity.this, Ciudades.class);
            startActivity(ir_ciudad);
        });

        btn_agregar_dato.setOnClickListener(v -> {
            Intent ir_date = new Intent(MainActivity.this, Datos.class);
            startActivity(ir_date);
        });

        btn_agregar_usuario.setOnClickListener(v -> {
            Intent ir_user = new Intent(MainActivity.this, Usuarios.class);
            startActivity(ir_user);
        });
    }
}

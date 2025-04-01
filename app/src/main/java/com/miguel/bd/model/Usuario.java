package com.miguel.bd.model;

public class Usuario {
    private int id;
    public String nombre_usuario;

    public Usuario(){}
    public Usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setName_user(String name_user) {
        this.nombre_usuario = name_user;
    }
}



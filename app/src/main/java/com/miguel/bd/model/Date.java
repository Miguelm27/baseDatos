package com.miguel.bd.model;

public class Date {
    private int id;
    public String nombre_date;
    public  String lastnombre_date;
    public  String location_date;
    public int id_ciudad;

    public Date(){}

    public Date(String nombre_date, String lastnombre_date, String location_date, int id_ciudad) {
        this.nombre_date = nombre_date;
        this.lastnombre_date = lastnombre_date;
        this.location_date = location_date;
        this.id_ciudad = id_ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_date() {
        return nombre_date;
    }

    public void setNombre_date(String name_date) {
        this.nombre_date = name_date;
    }

    public String getLastnombre_date() {
        return lastnombre_date;
    }

    public void setLastnombre_date(String lastname_date) {
        this.lastnombre_date = lastname_date;
    }

    public String getLocation_date() {
        return location_date;
    }

    public void setLocation_date(String location_date) {
        this.location_date = location_date;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
}



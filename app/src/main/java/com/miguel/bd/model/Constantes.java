package com.miguel.bd.model;

public class Constantes {
    public static String NAME_DB = "base_datos";
    public static int VERSION_DB = 90;

    public static String SENTENCIA_CIUDAD =
            "CREATE TABLE Ciudad (id INTEGER PRIMARY KEY AUTOINCREMENT, name_city VARCHAR)";

    public static String CREATE_USUARIO =
            "CREATE TABLE Usuario (id INTEGER PRIMARY KEY AUTOINCREMENT, name_user VARCHAR)";

    public static String CREATE_DATE =
            "CREATE TABLE dates (id INTEGER PRIMARY KEY AUTOINCREMENT, name_date VARCHAR, " +
                    "lastname_date VARCHAR, direction_date VARCHAR, id_city INTEGER, " +
                    "FOREIGN KEY (id_city) REFERENCES Ciudad(id))";
}

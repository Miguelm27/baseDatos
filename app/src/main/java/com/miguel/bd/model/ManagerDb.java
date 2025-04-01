package com.miguel.bd.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ManagerDb {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public ManagerDb(Context context) {
        dbHelper = new DbHelper(context);
    }

    public void openDbWrite() {
        db = dbHelper.getWritableDatabase();
    }

    public void openDbRead() {
        db = dbHelper.getReadableDatabase();
    }

    public void close() {
        if (db != null && db.isOpen()) {
            db.close();
        }
    }

    public long insertDate(Date date) {
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("nombre_date", date.getNombre_date());
        valores.put("lastnombre_date", date.getLastnombre_date());
        valores.put("location_date", date.getLocation_date());
        valores.put("id_ciudad", date.getId_ciudad());
        long res = db.insert("Date", null, valores);
        close();
        return res;
    }

    public long insertCity(Ciudad ciudad) {
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("nombre_ciudad", ciudad.getName());
        long res = db.insert("Ciudad", null, valores);
        close();
        return res;
    }

    public long insertUser(Usuario usuario) {
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("nombre_usuario", usuario.getNombre_usuario());
        long res = db.insert("Usuario", null, valores);
        close();
        return res;
    }
}

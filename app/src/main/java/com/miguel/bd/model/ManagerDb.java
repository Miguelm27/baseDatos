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
        valores.put("name_date", date.getNombre_date());
        valores.put("lastname_date", date.getLastnombre_date());
        valores.put("direction_date", date.getLocation_date());
        valores.put("id_city", date.getId_ciudad());
        long res = db.insert("dates", null, valores);
        close();
        return res;
    }

    public long insertCity(Ciudad ciudad) {
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("name_city", ciudad.getName());
        long res = db.insert("Ciudad", null, valores);
        close();
        return res;
    }

    public long insertUser(Usuario usuario) {
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("name_user", usuario.getNombre_usuario());
        long res = db.insert("Usuario", null, valores);
        close();
        return res;
    }
}

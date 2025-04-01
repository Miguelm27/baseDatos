package com.miguel.bd.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final String TAG = "DbHelper";

    public DbHelper(@Nullable Context context) {
        super(context, Constantes.NAME_DB, null, Constantes.VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
        db.execSQL(Constantes.SENTENCIA_CIUDAD);
        db.execSQL(Constantes.CREATE_USUARIO);
        db.execSQL(Constantes.CREATE_DATE);
        Log.i(TAG, "Base de datos creada");
        } catch (Exception e) {
            Log.e(TAG, "Error al crear la base de datos"+e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS dates");
        db.execSQL("DROP TABLE IF EXISTS ciudad");
        db.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(db);
    }

}

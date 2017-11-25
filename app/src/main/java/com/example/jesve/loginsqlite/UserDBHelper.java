package com.example.jesve.loginsqlite;

/*
 * Created by jesve on 24/11/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.jesve.loginsqlite.Userdb.SQL_CREAR_ENTRADAS;
import static com.example.jesve.loginsqlite.Userdb.SQL_ELIMINAR_ENTRADAS;

public class UserDBHelper extends SQLiteOpenHelper {

    private static final String DB_NOMBRE = "Users.db";
    private static final int DB_VERSION = 1;

    public UserDBHelper(Context context) {
        super(context, DB_NOMBRE, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREAR_ENTRADAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_ELIMINAR_ENTRADAS);
        onCreate(db);
    }
}
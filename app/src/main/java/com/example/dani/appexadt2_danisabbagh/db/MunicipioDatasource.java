package com.example.dani.appexadt2_danisabbagh.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.dani.appexadt2_danisabbagh.model.Eventos;

public class MunicipioDatasource {
    private EventosDBSQLiteHelper sqlHelper;
    private Context contexto;

    public MunicipioDatasource(Context contexto) {
        this.contexto = contexto;
        sqlHelper = new EventosDBSQLiteHelper(contexto);
    }

    public SQLiteDatabase openReadable() {
        return sqlHelper.getReadableDatabase();
    }

    public SQLiteDatabase openWriteable() {
        return sqlHelper.getWritableDatabase();
    }

}
//TODO HICE LA CONSULTA DE MUNICIPIO EN EVENTODATASOURCE
package com.example.dani.appexadt2_danisabbagh.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.dani.appexadt2_danisabbagh.model.Eventos;

public class EventoDatasource {
    private EventosDBSQLiteHelper sqlHelper;
    private Context contexto;

    public EventoDatasource(Context contexto) {
        this.contexto = contexto;
        sqlHelper = new EventosDBSQLiteHelper(contexto);
    }

    public SQLiteDatabase openReadable() {
        return sqlHelper.getReadableDatabase();
    }

    public SQLiteDatabase openWriteable() {
        return sqlHelper.getWritableDatabase();
    }

    public void close(SQLiteDatabase database) {
        database.close();
    }

    public long insertarEvento(Eventos evento) {

        SQLiteDatabase database = openWriteable();
        database.beginTransaction();
        ContentValues eventoValues = new ContentValues();

        String comprobacion = evento.getNombreMunicipio();
        String sentencia = "SELECT " + EventosDBContract.MunicipiosEntry.COLUMN_NOMBRE
                + " FROM "+ EventosDBContract.MunicipiosEntry.TABLE_NAME+" WHERE " + EventosDBContract.MunicipiosEntry.COLUMN_NOMBRE + " = '" + comprobacion + "'";

        Cursor miCursor = database.rawQuery(sentencia, null );

        eventoValues.put(EventosDBContract.EventosEntry.COLUMN_NOMBRE, evento.getNombreEvento());
        eventoValues.put(EventosDBContract.EventosEntry.COLUMN_MUNICIPIO, evento.getNombreMunicipio());
        eventoValues.put(EventosDBContract.EventosEntry.COLUMN_DESCRIPCION, evento.getDescripcion());
        eventoValues.put(EventosDBContract.EventosEntry.COLUMN_FECHA, evento.getFecha());
        eventoValues.put(EventosDBContract.EventosEntry.COLUMN_HORA, evento.getHora());
        int idEvento = (int) database.insert(EventosDBContract.EventosEntry.TABLE_NAME, null, eventoValues);
        if (miCursor.moveToFirst() == true) {
            if (idEvento != -1) {
                database.setTransactionSuccessful();
            }
            database.endTransaction();
            close(database);

        } else {
            Toast.makeText(contexto, "No coincide con los municipios registrados", Toast.LENGTH_SHORT).show();

        }
        return idEvento;

    }

    public Eventos ConsultarEventos(String nombre) {
        String nombree;
        String municipio;
        String descripcion;
        String fecha;
        String hora;

        SQLiteDatabase database = openReadable();
        Eventos eventos = null;

        String sentencia = "SELECT "
                + EventosDBContract.EventosEntry.COLUMN_NOMBRE + ", "
                + EventosDBContract.EventosEntry.COLUMN_MUNICIPIO + ", "
                + EventosDBContract.EventosEntry.COLUMN_DESCRIPCION + ", "
                + EventosDBContract.EventosEntry.COLUMN_FECHA + ", "
                + EventosDBContract.EventosEntry.COLUMN_HORA
                + " FROM ALIMENTO WHERE "
                + EventosDBContract.EventosEntry.COLUMN_NOMBRE + " = '" + nombre + "'";
        Cursor miCursor = database.rawQuery(sentencia, null);
        if (miCursor.moveToFirst()) {
            nombree = miCursor.getString(miCursor.getColumnIndex(EventosDBContract.EventosEntry.COLUMN_NOMBRE));
            municipio = miCursor.getString(miCursor.getColumnIndex(EventosDBContract.EventosEntry.COLUMN_MUNICIPIO));
            descripcion = miCursor.getString(miCursor.getColumnIndex(EventosDBContract.EventosEntry.COLUMN_DESCRIPCION));
            fecha = miCursor.getString(miCursor.getColumnIndex(EventosDBContract.EventosEntry.COLUMN_FECHA));
            hora = miCursor.getString(miCursor.getColumnIndex(EventosDBContract.EventosEntry.COLUMN_HORA));
            eventos = new Eventos(nombree, municipio, descripcion, fecha, hora);
        }
        close(database);
        return eventos;
    }

    public void borrarEventos(String nombre) {

        SQLiteDatabase database = openWriteable();

        database.beginTransaction();


        String[] args = {String.valueOf(nombre)};
        database.delete(EventosDBContract.EventosEntry.TABLE_NAME,
                EventosDBContract.EventosEntry.COLUMN_NOMBRE + "=?", args);

        database.setTransactionSuccessful();
        database.endTransaction();

        database.close();

    }
}






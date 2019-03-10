package com.example.dani.appexadt2_danisabbagh.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.dani.appexadt2_danisabbagh.model.Municipios;

import java.util.ArrayList;

public class EventosDBSQLiteHelper extends SQLiteOpenHelper {

    static final String DATABSE_NAME = "TablasDB";
    static final int DATABASE_VERSION = 4;

    private ArrayList<Municipios> listaInicialMunicipios = new ArrayList<Municipios>();

    static final String CREATE_TABLE_EVENTOS =
            "CREATE TABLE "+ EventosDBContract.EventosEntry.TABLE_NAME+ "( "+
                    EventosDBContract.EventosEntry.COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                    EventosDBContract.EventosEntry.COLUMN_NOMBRE+" TEXT NOT NULL UNIQUE,"+
                    EventosDBContract.EventosEntry.COLUMN_MUNICIPIO+" TEXT NOT NULL,"+
                    EventosDBContract.EventosEntry.COLUMN_DESCRIPCION+" TEXT NOT NULL,"+
                    EventosDBContract.EventosEntry.COLUMN_FECHA+" TEXT NOT NULL,"+
                    EventosDBContract.EventosEntry.COLUMN_HORA+" TEXT NOT NULL);";
    static final String CREATE_TABLE_MUNICIPIOS =
            "CREATE TABLE "+ EventosDBContract.MunicipiosEntry.TABLE_NAME + "( "+
                    EventosDBContract.MunicipiosEntry.COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                    EventosDBContract.MunicipiosEntry.COLUMN_NOMBRE+ "TEXT NOT NULL);";

    private void cargarListaMunicipios(){
        listaInicialMunicipios.add(new Municipios("LA ACEBEDA "));
        listaInicialMunicipios.add(new Municipios("ALALPARDO"));
        listaInicialMunicipios.add(new Municipios("ALAMEDA DEL VALLE "));
        listaInicialMunicipios.add(new Municipios("ALCOBENDAS "));
        listaInicialMunicipios.add(new Municipios("ALGETE "));
        listaInicialMunicipios.add(new Municipios("EL ATAZAR"));
        listaInicialMunicipios.add(new Municipios("BERZOSA"));
        listaInicialMunicipios.add(new Municipios("EL BERRUECO"));
        listaInicialMunicipios.add(new Municipios("BRAOJOS"));
        listaInicialMunicipios.add(new Municipios("BUITRAGO"));
        listaInicialMunicipios.add(new Municipios("BUSTARVIEJO "));
        listaInicialMunicipios.add(new Municipios("CABANILLAS DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("LA CABRERA"));
        listaInicialMunicipios.add(new Municipios("CANENCIA"));
        listaInicialMunicipios.add(new Municipios("CERVERA DE BUITRAGO"));
        listaInicialMunicipios.add(new Municipios("COLMENAR VIEJO"));
        listaInicialMunicipios.add(new Municipios("FUENTE EL SAZ"));
        listaInicialMunicipios.add(new Municipios("GARGANTA DE LOS MONTES"));
        listaInicialMunicipios.add(new Municipios("GARGANTILLA"));
        listaInicialMunicipios.add(new Municipios("GASCONES"));
        listaInicialMunicipios.add(new Municipios("GUADALIX DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("LA HIRUELA"));
        listaInicialMunicipios.add(new Municipios("HORCAJO DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("HORCAJUELO DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("LOZOYA"));
        listaInicialMunicipios.add(new Municipios("LOZOYUELA"));
        listaInicialMunicipios.add(new Municipios("MADARCOS"));
        listaInicialMunicipios.add(new Municipios("MANZANARES EL REAL"));
        listaInicialMunicipios.add(new Municipios("MIRAFLORES DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("EL MOLAR"));
        listaInicialMunicipios.add(new Municipios("MONTEJO DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("NAVALAFUENTE"));
        listaInicialMunicipios.add(new Municipios("NAVARREDONDA"));
        listaInicialMunicipios.add(new Municipios("OTERUELO DEL VALLE"));
        listaInicialMunicipios.add(new Municipios("PRÁDENA DEL RINCÓN"));
        listaInicialMunicipios.add(new Municipios("PAREDES DE BUITRAGO"));
        listaInicialMunicipios.add(new Municipios("PATONES"));
        listaInicialMunicipios.add(new Municipios("PEDREZUELA"));
        listaInicialMunicipios.add(new Municipios("PINILLA DEL VALLE"));
        listaInicialMunicipios.add(new Municipios("PIÑUECAR"));
        listaInicialMunicipios.add(new Municipios("PUEBLA DE LA SIERRA"));
        listaInicialMunicipios.add(new Municipios("PUENTES VIEJAS"));
        listaInicialMunicipios.add(new Municipios("RASCAFRÍA"));
        listaInicialMunicipios.add(new Municipios("RIBATEJADA"));
        listaInicialMunicipios.add(new Municipios("RIDUEÑA"));
        listaInicialMunicipios.add(new Municipios("ROBLEDILLO"));
        listaInicialMunicipios.add(new Municipios("ROBREGORDO"));
        listaInicialMunicipios.add(new Municipios("SAN AGUSTÍN DEL GUADALIX"));
        listaInicialMunicipios.add(new Municipios("SAN SEBASTIÁN DE LOS REYES"));
        listaInicialMunicipios.add(new Municipios("SERNA DEL MONTELA"));
        listaInicialMunicipios.add(new Municipios("SOMOSIERRA"));
        listaInicialMunicipios.add(new Municipios("SOTO DEL REAL"));
        listaInicialMunicipios.add(new Municipios("TALAMANCA DE JARAMA"));
        listaInicialMunicipios.add(new Municipios("TORRELAGUNA"));
        listaInicialMunicipios.add(new Municipios("TORREMOCHA DE JARAMA"));
        listaInicialMunicipios.add(new Municipios("TRES CANTOS"));
        listaInicialMunicipios.add(new Municipios("VALDEMANCO"));
        listaInicialMunicipios.add(new Municipios("VALDEOLMOS"));
        listaInicialMunicipios.add(new Municipios("VALDEPIÉLAGOS"));
        listaInicialMunicipios.add(new Municipios("VALDETORRES DEL JARAMA"));
        listaInicialMunicipios.add(new Municipios("EL VELLÓN "));
        listaInicialMunicipios.add(new Municipios("VENTURADA"));
        listaInicialMunicipios.add(new Municipios("VILLAVIEJA LOZOYA"));

    }
    public EventosDBSQLiteHelper(Context contexto){
        super(contexto, DATABSE_NAME, null, DATABASE_VERSION);
    }
    public void cargaInicialMunicipios(SQLiteDatabase db){
        db.beginTransaction();
        ContentValues munValues = null;
        for(int i=0;i<listaInicialMunicipios.size();i++){
            munValues = new ContentValues();
            munValues.put(EventosDBContract.MunicipiosEntry.COLUMN_NOMBRE,listaInicialMunicipios.get(i).getNombreMunicipio());

            db.insert(EventosDBContract.MunicipiosEntry.TABLE_NAME,null,munValues);
        }
        db.setTransactionSuccessful();
        db.endTransaction();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_EVENTOS);
        db.execSQL(CREATE_TABLE_MUNICIPIOS);
        cargarListaMunicipios();
        cargaInicialMunicipios(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +EventosDBContract.EventosEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " +EventosDBContract.MunicipiosEntry.TABLE_NAME);
        onCreate(db);

    }
}

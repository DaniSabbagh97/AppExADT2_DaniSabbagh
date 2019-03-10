package com.example.dani.appexadt2_danisabbagh.db;

import android.provider.BaseColumns;

public class EventosDBContract {
    public static abstract class EventosEntry implements BaseColumns{
        public static final String TABLE_NAME = "EVENTOS";

        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_NOMBRE = "NOMBRE";
        public static final String COLUMN_MUNICIPIO = "MUNICIPIO";
        public static final String COLUMN_DESCRIPCION = "DESCRIPCION";
        public static final String COLUMN_FECHA = "FECHA";
        public static final String COLUMN_HORA = "HORA";
    }
    public static abstract class MunicipiosEntry implements BaseColumns{
        public static final String TABLE_NAME = "MUNICIPIOS";

        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_NOMBRE = "NOMBRE";
    }
}

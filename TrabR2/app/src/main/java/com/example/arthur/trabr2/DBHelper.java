package com.example.arthur.trabr2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Arthur on 24/11/2015.
 */
public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_TRAB = "Recuperacao";

    private static final String NOME = "avaliador";
    private static final String TRABALHO = "titulo";
    private static final String NOTA = "nota";
    private static final String COMENTARIO = "coment";
    private static final String ID = "_ID";
    private static final String TB = "avaliação";


    private static final String TB_CREATE = "CEATE_TABLE"
            + NOME + "varchar(100),"
            +TRABALHO + "varchar(100),"
            +NOTA + "varchar(4),"
            +COMENTARIO + "varchar(200),"
            +TB
            + ID +"(integer primary key autoincrement);";


    DBHelper(Context context){
        super (context, DATABASE_TRAB, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop TB_CREATE");
        onCreate(db);
    }
}

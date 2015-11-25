package com.example.arthur.trabr2;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Arthur on 24/11/2015.
 */
public class SQLiteDB {
    private SQLiteDatabase bd;

    public SQLiteDB(Context context){
        DBHelper auxBd = new DBHelper(context);
        bd = auxBd.getWritableDatabase();
    }

    public void  inserir(User user){
        ContentValues valores = new ContentValues();
        valores.put("NOME",(user.getNome()));
        valores.put("TRABALHO", user.getTrabalho());
        valores.put("NOTA", user.getNota());
        valores.put("COMENTARIO", user.getComentario());

        bd.insert("TB", null, valores);
    }


    public int consulta(){
        String[] colunas = new String[]{"_ID"};
        Cursor cursor = bd.query("TB", colunas, null, null, null, null, "_ID");
        int num = cursor.getCount();
        return num;
    }

    }



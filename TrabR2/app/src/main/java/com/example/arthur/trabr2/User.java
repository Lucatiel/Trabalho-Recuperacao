package com.example.arthur.trabr2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Arthur on 24/11/2015.
 */
public class User {

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public String getTrabalho() {
        return Trabalho;
    }

    public void setTrabalho(String trabalho) {
        Trabalho = trabalho;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;
    private  String Nome;
    private  String Nota;
    private  String Trabalho;
    private  String Comentario;




}

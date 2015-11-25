package com.example.arthur.trabr2;

import android.app.NotificationManager;
import android.os.PersistableBundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    User usuario = new User();
    private EditText nomeET;
    private EditText trabalhoET;
    private EditText notaET;
    private EditText comentarioET;
    private Button avaliarBT;
    private Button contBT;

    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        avaliarBT = (Button) findViewById(R.id.Avaliar);
        contBT = (Button) findViewById(R.id.Contar);

        avaliarBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();

                nomeET = (EditText) findViewById(R.id.Nome);
                trabalhoET = (EditText) findViewById(R.id.Trabalho);
                notaET = (EditText) findViewById(R.id.Nota);
                comentarioET = (EditText) findViewById(R.id.Comentario);

                user.setNome(nomeET.getText().toString());
                user.setTrabalho(trabalhoET.getText().toString());
                user.setNota(notaET.getText().toString());
                user.setComentario(comentarioET.getText().toString());

                SQLiteDB DB = new SQLiteDB(MainActivity.this);
                DB.inserir(user);
                Toast.makeText(MainActivity.this, "Mal Feito, Feito!!!", Toast.LENGTH_SHORT).show();
            }
        });

        contBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note();
            }
        });
    }

        public void Note(){
         SQLiteDB DB = new SQLiteDB(MainActivity.this);
         int noteID = 1;

            NotificationCompat.Builder noteBuilder = new NotificationCompat.Builder(MainActivity.this);
            noteBuilder.setContentTitle("Quantidade de Avaliaçoes feitas")
                       .setContentText(""+DB.consulta());

            NotificationManagerCompat noteManager =
                NotificationManagerCompat.from(MainActivity.this);
        noteManager.notify(noteID, noteBuilder.build());
    }



}


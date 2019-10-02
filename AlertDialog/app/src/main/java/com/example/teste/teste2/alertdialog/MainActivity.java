package com.example.teste.teste2.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlert(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Título");
        dialog.setMessage("Mensagem");

        dialog.setCancelable(true);

        dialog.setIcon(android.R.drawable.ic_dialog_info);

        dialog.setPositiveButton("Permitir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Permitido", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Negar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Negado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create();
        dialog.show();

    }

}

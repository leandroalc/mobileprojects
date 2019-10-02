package com.example.teste.teste2.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Switch switchSenha;
    private ToggleButton toggleSenha;
    private CheckBox checkSenha;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchSenha = findViewById(R.id.switchTeste);
        toggleSenha = findViewById(R.id.toggleButton);
        checkSenha = findViewById(R.id.checkBoxLembrar);
        resultado = findViewById(R.id.textViewResultado);
    }

    public void enviar(View v){
        
    }
}

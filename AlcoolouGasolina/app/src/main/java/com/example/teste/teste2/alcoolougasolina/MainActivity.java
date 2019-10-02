package com.example.teste.teste2.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool, precoGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        precoAlcool = findViewById(R.id.editTextAlcool);
        precoGasolina = findViewById(R.id.editTextGasolina);
        resultado = findViewById(R.id.textViewResultado);
    }

    public void calcularPreco(View view){
        String alcool = precoAlcool.getText().toString();
        String gasolina = precoGasolina.getText().toString();

        Boolean camposValidados = this.validarCampos(alcool, gasolina);

        if (camposValidados){
            this.calcularMelhorPreco(alcool, gasolina);
        }else{
            resultado.setText("Preencha os preços primeiro!");
        }

    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){
        Double prAlcool = Double.parseDouble(pAlcool);
        Double prGasolina = Double.parseDouble(pGasolina);

        Double soma = prAlcool / prGasolina;
        if (soma >= 0.7){
            resultado.setText("Melhor utilizar Gasolina!");
        }else{
            resultado.setText("Melhor utilizar Álcool!");
        }
    }

    public boolean validarCampos(String pAlcool, String pGasolina){
        boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }

        return camposValidados;
    }
}

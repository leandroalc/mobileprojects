package com.example.teste.teste2.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText campoGorjeta;
    private TextView porcentagem;
    private TextView gorjeta;
    private TextView total;
    private SeekBar seekBarGorjeta;

    private double p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoGorjeta = findViewById(R.id.editTextValor);
        porcentagem = findViewById(R.id.textViewPorcentagem);
        gorjeta = findViewById(R.id.textViewValorGorjeta);
        total = findViewById(R.id.textViewValorTotal);
        seekBarGorjeta = findViewById(R.id.seekBarPorcentagem);

        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p = seekBar.getProgress();
                porcentagem.setText(Math.round(p) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){

        double valorDigitado = Double.parseDouble(campoGorjeta.getText().toString());
        double calcGorjeta = valorDigitado * (p/100);
        double calcTotal = calcGorjeta + valorDigitado;

        gorjeta.setText("R$ " + Math.round(calcGorjeta));
        total.setText("R$ " + Math.round(calcTotal));
    }

}

package com.example.ianael.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class novo extends AppCompatActivity {

    private EditText etKm;
    private EditText etL;
    private EditText etData;
    private Spinner spPosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo);

        etKm = (EditText) findViewById(R.id.etKm);
        etL = (EditText) findViewById(R.id.etL);
        etData = (EditText) findViewById(R.id.etData);
        spPosto = (Spinner) findViewById(R.id.spPosto);
    }

    public void confirmar(View clicou){

        if(etData.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Data!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(etKm.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Km!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(Autonomia.info.size() > 0 && Autonomia.info.get(Autonomia.info.size() - 1).getKm() >= Float.parseFloat(etKm.getText().toString())) {
            Toast.makeText(getApplicationContext(), "A Km atual deve ser maior que a última adicionada!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(etL.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Litros!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(spPosto.getSelectedItemId() == 0) {
            Toast.makeText(getApplicationContext(), "Selecione um posto!!!", Toast.LENGTH_LONG).show();
            return;
        }

        Autonomia autonomia = new Autonomia(etData.getText().toString(), Float.parseFloat(etKm.getText().toString()), Float.parseFloat(etL.getText().toString()), spPosto.getSelectedItem().toString());

        Autonomia.info.add(autonomia);
        finish();
    }
}

package com.example.ianael.autonomia;

import android.content.Intent;
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
        if(etKm > etKm){
            etKm.setError("Km inválida");
            Toast.makeText(this.getApplicationContext(), "A Km atual deve ser maior que a última adicionada!!!", Toast.LENGTH_SHORT).show();

            //double autonomia = KmTotal/LitrosTotal;
            return;
        }else {
            Intent intencao = new Intent(getApplicationContext(), MainActivity.class);
            intencao.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intencao);
        }
    }
}

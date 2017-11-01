package com.example.ianael.sistema_area;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DadosCirculo extends AppCompatActivity {

    private EditText etRaio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_circulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Área do Círculo");
        etRaio = (EditText) findViewById(R.id.etRaio);
    }

    public void calcularC(View clicou){

        if(etRaio.getText().toString().equals("")){
            etRaio.setError("Raio inválido");
            Toast.makeText(this.getApplicationContext(), "Erro, raio inválido", Toast.LENGTH_SHORT).show();
            return;

        }else{
            double raio = Double.parseDouble( etRaio.getText().toString() );
            double resultado = Math.PI*Math.pow(raio,2);

            Bundle informacoes = new Bundle();

            informacoes.putDouble("resultadoC", resultado);
            informacoes.putString("forma", "Círculo");

            Intent intencao = new Intent(getApplicationContext(), Area.class);

            intencao.putExtras(informacoes);

            startActivity(intencao);
        }
    }
}

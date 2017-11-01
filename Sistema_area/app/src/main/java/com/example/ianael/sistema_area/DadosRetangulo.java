package com.example.ianael.sistema_area;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DadosRetangulo extends AppCompatActivity {

    private EditText etAlturaR;
    private EditText etBaseR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_retangulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Área do Retângulo");
        etAlturaR = (EditText) findViewById(R.id.etAlturaR);
        etBaseR = (EditText) findViewById(R.id.etBaseR);
    }

    public void calcularR(View clicou){

        if(etAlturaR.getText().toString().equals("") || etBaseR.getText().toString().equals("")){
            etAlturaR.setError("Altura inválida");
            etBaseR.setError("Base inválida");
            Toast.makeText(this.getApplicationContext(), "Erro, insira todos os valores", Toast.LENGTH_SHORT).show();
            return;

        }else{
            double base = Double.parseDouble( etBaseR.getText().toString() );
            double altura = Double.parseDouble( etAlturaR.getText().toString() );

            double resultado = base*altura;

            Bundle informacoes = new Bundle();

            informacoes.putDouble("resultadoR", resultado);
            informacoes.putString("forma", "Retângulo");

            Intent intencao = new Intent(getApplicationContext(), Area.class);

            intencao.putExtras(informacoes);

            startActivity(intencao);
        }
    }
}

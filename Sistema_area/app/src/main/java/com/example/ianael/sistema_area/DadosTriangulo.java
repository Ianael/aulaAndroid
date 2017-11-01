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

public class DadosTriangulo extends AppCompatActivity {

    private EditText etAlturaT;
    private EditText etBaseT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_triangulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Área do Triângulo");
        etAlturaT = (EditText) findViewById(R.id.etAlturaT);
        etBaseT = (EditText) findViewById(R.id.etBaseT);

    }

    public void calcularT(View clicou){

        if(etAlturaT.getText().toString().equals("") || etBaseT.getText().toString().equals("")){
            etAlturaT.setError("Altura inválida");
            etBaseT.setError("Base inválida");
            Toast.makeText(this.getApplicationContext(), "Erro, insira todos os valores", Toast.LENGTH_SHORT).show();
            return;

        }else{
            double base = Double.parseDouble( etBaseT.getText().toString() );
            double altura = Double.parseDouble( etAlturaT.getText().toString() );

            double resultado = base*altura/2;

            Bundle informacoes = new Bundle();

            informacoes.putDouble("resultadoT", resultado);
            informacoes.putString("forma", "Triângulo");

            Intent intencao = new Intent(getApplicationContext(), Area.class);

            intencao.putExtras(informacoes);

            startActivity(intencao);
        }
    }
}

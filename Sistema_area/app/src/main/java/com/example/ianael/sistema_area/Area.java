package com.example.ianael.sistema_area;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Area extends AppCompatActivity {

    private Bundle InformacaoRecebida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Área da Figura");

        InformacaoRecebida = getIntent().getExtras();

        if(InformacaoRecebida.getString("forma").equals("Círculo")){
            double resultado = getIntent().getExtras().getDouble("resultadoC");

            ImageView ivForma = (ImageView) findViewById(R.id.ivForma);
            ivForma.setImageResource(R.drawable.circle);

            TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
            tvResultado.setText("Área: "+String.format("%.2f", resultado)+"m²");

        }else if(InformacaoRecebida.getString("forma").equals("Retângulo")){
            double resultado = getIntent().getExtras().getDouble("resultadoR");

            ImageView ivForma = (ImageView) findViewById(R.id.ivForma);
            ivForma.setImageResource(R.drawable.rectangle);

            TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
            tvResultado.setText("Área: "+String.format("%.2f", resultado)+"m²");

        }else if(InformacaoRecebida.getString("forma").equals("Triângulo")){
            double resultado = getIntent().getExtras().getDouble("resultadoT");

            ImageView ivForma = (ImageView) findViewById(R.id.ivForma);
            ivForma.setImageResource(R.drawable.triangle);

            TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
            tvResultado.setText("Área: "+String.format("%.2f", resultado)+"m²");

        }

    }

    public void recomecar(View clicou){
        Intent intencao = new Intent(getApplicationContext(), MainActivity.class);
        intencao.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intencao);
    }

}

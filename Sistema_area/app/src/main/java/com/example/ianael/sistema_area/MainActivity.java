package com.example.ianael.sistema_area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void avancar(View clicou){
        RadioGroup rgEscolha = (RadioGroup) findViewById(R.id.rgSelecao);
        if(rgEscolha.getCheckedRadioButtonId() == -1){
            Toast.makeText(getApplicationContext(), "Selecione uma opção!",Toast.LENGTH_LONG).show();
        }else if(rgEscolha.getCheckedRadioButtonId() == R.id.rbCirculo){
            Intent intencao = new Intent(getApplicationContext(), DadosCirculo.class);
            startActivity(intencao);
        }else if(rgEscolha.getCheckedRadioButtonId() == R.id.rbRetangulo){
            Intent intencao = new Intent(getApplicationContext(), DadosRetangulo.class);
            startActivity(intencao);
        }else if(rgEscolha.getCheckedRadioButtonId() == R.id.rbTriangulo){
            Intent intencao = new Intent(getApplicationContext(), DadosTriangulo.class);
            startActivity(intencao);
        }
    }
}

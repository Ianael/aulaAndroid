package com.example.ianael.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Autonomia> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvAuto = (TextView) findViewById(R.id.tvAuto);
        //tvAuto.setText(autonomia);
    }

    public void novo(View clicou){
        Intent intencao = new Intent(getApplicationContext(), novo.class);
        intencao.putExtra("lista", info);
        startActivity(intencao);
    }

    public void visualisar(View clicou){
        Intent intencao = new Intent(getApplicationContext(), lista.class);
        intencao.putExtra("lista", info);
        startActivity(intencao);
    }
}

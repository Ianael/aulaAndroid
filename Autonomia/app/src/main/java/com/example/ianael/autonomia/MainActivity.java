package com.example.ianael.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvAuto = (TextView) findViewById(R.id.tvAuto);
        //tvAuto.setText(autonomia);
    }

    public void novo(View clicou){
        Intent intencao = new Intent(getApplicationContext(), novo.class);
        startActivity(intencao);
    }

    public void visualisar(View clicou){
        Intent intencao = new Intent(getApplicationContext(), lista.class);
        startActivity(intencao);
    }
}

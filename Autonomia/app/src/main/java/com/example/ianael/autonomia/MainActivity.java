package com.example.ianael.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private TextView tvAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Realm.init(this);

        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        Realm realm = Realm.getDefaultInstance();

        Autonomia.info = new ArrayList<>(realm.where(Autonomia.class).findAll());
    }

    protected void onResume(){
        tvAuto = (TextView) findViewById(R.id.tvAuto);

        if(Autonomia.info.size() > 0){

            double KmTotal = 0;
            double LTotal = 0;

            KmTotal = Autonomia.info.get(Autonomia.info.size() - 1).getKm() - Autonomia.info.get(Autonomia.info.size() - 2).getKm();
            LTotal = Autonomia.info.get(Autonomia.info.size() - 2).getL();

            double autonomia = KmTotal / LTotal;

            tvAuto.setText(String.format("%.2f",autonomia));
        }
        super.onResume();
    }

    public void novo(View clicou){
        Intent intencao = new Intent(getApplicationContext(), novo.class);
        startActivity(intencao);
    }

    public void visualisar(View clicou){
        Intent intencao = new Intent(getApplicationContext(), visualisar.class);
        startActivity(intencao);
    }
}

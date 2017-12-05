package com.example.ianael.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private TextView tvAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Realm.init(this);

        setContentView(R.layout.activity_main);

        tvAuto = (TextView) findViewById(R.id.tvAuto);

        setContentView(R.layout.activity_main);

        Realm realm = Realm.getDefaultInstance();

        RealmResults <Autonomia> result = realm.where(Autonomia.class).findAll();
        for(Autonomia atual : result){
            Autonomia.info.add(atual);
        }

        if(Autonomia.info.size() > 0){
            double KmTotal = 0;
            double LTotal = 0;

            for(int i = 0; i < Autonomia.info.size(); i++){
                LTotal += Autonomia.info.get(i).getL();
                KmTotal += Autonomia.info.get(i).getKm();
            }

            double autonomia = KmTotal / LTotal;
            tvAuto.setText(String.format("%.2f",autonomia));
        }
    }

   // protected void onResume(){



   //     super.onResume();
    //}

    public void novo(View clicou){
        Intent intencao = new Intent(getApplicationContext(), novo.class);
        startActivity(intencao);
    }

    public void visualisar(View clicou){
        Intent intencao = new Intent(getApplicationContext(), visualisar.class);
        startActivity(intencao);
    }
}

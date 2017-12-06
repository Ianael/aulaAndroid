package com.example.ianael.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import io.realm.Realm;

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

        if(etData.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Data!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(etKm.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Km!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(Autonomia.info.size() > 0 && Autonomia.info.get(Autonomia.info.size() - 1).getKm() >= Double.parseDouble(etKm.getText().toString())) {
            Toast.makeText(getApplicationContext(), "A Km atual deve ser maior que a última adicionada!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(etL.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Insira um valor válido para Litros!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(spPosto.getSelectedItemId() == 0) {
            Toast.makeText(getApplicationContext(), "Selecione um posto!!!", Toast.LENGTH_LONG).show();
            return;
        }

        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();

        Autonomia r = realm.createObject(Autonomia.class);

        r.setData(etData.getText().toString());
        r.setKm(Double.parseDouble(etKm.getText().toString()));
        r.setL(Double.parseDouble(etL.getText().toString()));
        r.setPosto(spPosto.getSelectedItem().toString());

        //Autonomia autonomia = new Autonomia(etData.getText().toString(), Double.parseDouble(etKm.getText().toString()), Double.parseDouble(etL.getText().toString()), spPosto.getSelectedItem().toString());

        realm.copyFromRealm(r);
        realm.commitTransaction();

        //Autonomia.info.add(autonomia);
        Intent intencao = new Intent(getApplicationContext(), MainActivity.class);
        intencao.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intencao);
    }
}

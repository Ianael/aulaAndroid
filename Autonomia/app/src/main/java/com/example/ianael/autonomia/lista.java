package com.example.ianael.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.realm.Realm;
import io.realm.RealmResults;

public class lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Realm realm = Realm.getDefaultInstance();
        RealmResults <Autonomia> result = realm.where(Autonomia.class).findAll();
        for (Autonomia atual : result) {
            Autonomia.info.add(atual);
        }

        RecyclerView rvLista = findViewById(R.id.rvLista);

        AutoAdapter adapter = new AutoAdapter();

        adapter.setInfo(Autonomia.info);
        rvLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        rvLista.setAdapter(adapter);
    }
}

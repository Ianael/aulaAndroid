package com.example.ianael.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class visualisar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualisar);

        ArrayList<Autonomia> list = new ArrayList<>();

        Realm realm = Realm.getDefaultInstance();
        RealmResults <Autonomia> result = realm.where(Autonomia.class).findAll();
        for (Autonomia atual : result) {
            list.add(atual);
        }

        RecyclerView rvLista = findViewById(R.id.rvLista);

        AutoAdapter adapter = new AutoAdapter();

        adapter.setInfo(list);
        rvLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        rvLista.setAdapter(adapter);
    }
}

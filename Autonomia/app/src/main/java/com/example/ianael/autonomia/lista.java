package com.example.ianael.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class lista extends AppCompatActivity {
    private TextView tvData;
    private TextView tvKm;
    private TextView tvL;
    private ImageView ivPosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        TextView tvData = (TextView) findViewById(R.id.tvData);
        //tvData.setText(data);
        TextView tvKm = (TextView) findViewById(R.id.tvKm);
        TextView tvL = (TextView) findViewById(R.id.tvL);
        ImageView ivPosto = (ImageView) findViewById(R.id.ivPosto);
        //ivPosto.setImageResource(R.drawable.);
    }
}

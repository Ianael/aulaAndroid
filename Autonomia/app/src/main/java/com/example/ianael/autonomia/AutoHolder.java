package com.example.ianael.autonomia;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ianael on 26/11/2017.
 */

public class AutoHolder extends RecyclerView.ViewHolder{
    private TextView tvData;
    private TextView tvKm;
    private TextView tvL;
    private ImageView ivPosto;

    public AutoHolder(View itemView) {
        super(itemView);

        this.tvData = itemView.findViewById(R.id.tvData);
        this.tvKm = itemView.findViewById(R.id.tvKm);
        this.tvL = itemView.findViewById(R.id.tvL);
        this.ivPosto = itemView.findViewById(R.id.ivPosto);
    }

    public void atualiza(Autonomia autonomia){
        tvData.setText( autonomia.getData() );
        tvL.setText( Double.toString( autonomia.getL() ));
        String x = ""+autonomia.getKm();
        tvKm.setText(x);

        if(autonomia.getPosto().equals("Ipiranga")){
            ivPosto.setImageResource(R.drawable.ipiranga);
        }else if (autonomia.getPosto().equals("Petrobras")){
            ivPosto.setImageResource(R.drawable.petrobras);
        }else if (autonomia.getPosto().equals("Texaco")){
            ivPosto.setImageResource(R.drawable.texaco);
        }else if (autonomia.getPosto().equals("Shell")){
            ivPosto.setImageResource(R.drawable.shell);
        }else{
            ivPosto.setImageResource(R.drawable.other);
        }
    }
}

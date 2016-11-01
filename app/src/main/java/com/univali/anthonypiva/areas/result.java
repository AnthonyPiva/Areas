package com.univali.anthonypiva.areas;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.provider.MediaStore;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.univali.anthonypiva.areas.R.drawable.circ;
import static com.univali.anthonypiva.areas.R.drawable.retan;
import static com.univali.anthonypiva.areas.R.drawable.trian;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        float resposta = getIntent().getFloatExtra("resposta",0);
        int op = getIntent().getIntExtra("op", 0);

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        ImageView ivImagem = (ImageView) findViewById(R.id.img);

        if(op == 1){
            ivImagem.setImageResource(R.drawable.circ);
        }else if(op == 2){
            ivImagem.setImageResource(R.drawable.retan);
        }else{
            ivImagem.setImageResource(R.drawable.trian);
        }
        tvResultado.setText("Área: "+resposta+" m²");
    }

    public void voltarInicio(View clicou){
        Intent abridor = new Intent(this.getApplicationContext(),Areas.class);

        startActivity(abridor);
    }
}

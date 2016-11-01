package com.univali.anthonypiva.calcareas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 5725089 on 01/11/2016.
 */
public class result extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        float resposta = getIntent().getFloatExtra("resposta",0);
        int op = getIntent().getIntExtra("op", 0);

        TextView Resultado = (TextView) findViewById(R.id.Resultado);
        ImageView ImgFinal = (ImageView) findViewById(R.id.imgFinal);

        if(op == 1){
            ImgFinal.setImageResource(R.drawable.circ);
        }else if(op == 2){
            ImgFinal.setImageResource(R.drawable.retan);
        }else{
            ImgFinal.setImageResource(R.drawable.triani);
        }
        Resultado.setText("Área: "+resposta+" m²");
    }

    public void Inicio(View clicou){
        Intent abridor = new Intent(this.getApplicationContext(),MainActivity.class);

        startActivity(abridor);
    }

}

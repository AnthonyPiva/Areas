package com.univali.anthonypiva.calcareas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 5725089 on 01/11/2016.
 */
public class retan extends Activity {

    private EditText BaseR;
    private EditText AlturaR;
    private Button CalcularR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retan);

        BaseR = (EditText) findViewById(R.id.BaseR);
        AlturaR = (EditText) findViewById(R.id.AlturaR);
        CalcularR = (Button) findViewById(R.id.CR);
    }

    public void CalR(View clicou) {
        if (BaseR.getText().toString().equals("") || AlturaR.getText().toString().equals("")) {
            Toast.makeText(this, "Informe ambos os valores para prosseguir", Toast.LENGTH_SHORT).show();
        } else {
            Intent abridor = new Intent(this.getApplicationContext(), result.class);

            String aux1 = BaseR.getText().toString();
            String aux2 = AlturaR.getText().toString();

            int base = Integer.parseInt(aux1);
            int altura = Integer.parseInt(aux2);
            float resultado = (float) (base * altura);

            abridor.putExtra("resposta", resultado);
            abridor.putExtra("op", 2);

            startActivity(abridor);
        }

    }
}
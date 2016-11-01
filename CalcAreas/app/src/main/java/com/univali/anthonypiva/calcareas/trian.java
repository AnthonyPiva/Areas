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
public class trian extends Activity {

    private EditText BaseT;
    private EditText AlturaT;
    private Button CalcularT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trian);

        BaseT = (EditText) findViewById(R.id.BaseT);
        AlturaT = (EditText) findViewById(R.id.AlturaT);
        CalcularT = (Button) findViewById(R.id.CT);
    }

    public void CalT(View clicou) {

        if (BaseT.getText().toString().equals("") || AlturaT.getText().toString().equals("")) {
            Toast.makeText(this, "Informe ambos os valores para prosseguir", Toast.LENGTH_SHORT).show();
        } else {
            Intent abridor = new Intent(this.getApplicationContext(), result.class);

            String aux1 = BaseT.getText().toString();
            String aux2 = AlturaT.getText().toString();

            int base = Integer.parseInt(aux1);
            int altura = Integer.parseInt(aux2);
            float resultado = (float) ((base * altura) / 2);

            abridor.putExtra("resposta", resultado);
            abridor.putExtra("op", 3);

            startActivity(abridor);
        }

    }
}

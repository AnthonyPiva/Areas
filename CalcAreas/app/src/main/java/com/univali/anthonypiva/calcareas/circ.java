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
public class circ extends Activity {

    private EditText RaioC;
    private Button CalcularC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circ);

        RaioC = (EditText) findViewById(R.id.RaioC);
        CalcularC = (Button) findViewById(R.id.CC);
    }

    public void CalC(View clicou) {
        if (RaioC.getText().toString().equals("")) {
            Toast.makeText(this, "Informe o raio para calcular", Toast.LENGTH_SHORT).show();
        } else {
            Intent abridor = new Intent(this.getApplicationContext(), result.class);

            String aux = RaioC.getText().toString();
            int raio = Integer.parseInt(aux);
            float resultado = (float) (3.14 * (raio * raio));

            abridor.putExtra("resposta", resultado);
            abridor.putExtra("op", 1);

            startActivity(abridor);
        }
    }
}
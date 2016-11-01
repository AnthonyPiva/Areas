package com.univali.anthonypiva.areas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class circulo extends AppCompatActivity {

    private EditText etRaio;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circulo);

        etRaio = (EditText) findViewById(R.id.valorRaio);
        btCalcular = (Button) findViewById(R.id.btCalcularCirculo);
    }

    public void calcularCirculo(View clicou){
        Intent abridor = new Intent(this.getApplicationContext(),result.class);

        String aux = etRaio.getText().toString();
        int raio = Integer.parseInt(aux);
        float resultado = (float) (3.14*(raio*raio));

        abridor.putExtra("resposta",resultado);
        abridor.putExtra("op",1);

        startActivity(abridor);
    }
}

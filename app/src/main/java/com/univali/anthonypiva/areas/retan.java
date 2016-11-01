package com.univali.anthonypiva.areas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class retan extends AppCompatActivity {

    private EditText etBase;
    private EditText etAltura;
    private Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retangulo);

        etBase = (EditText) findViewById(R.id.valorBaseR);
        etAltura = (EditText) findViewById(R.id.valorAlturaR);
        btCalcular = (Button) findViewById(R.id.btCalcularRetangulo);
    }

    public void calcularRetacgulo(View clicou){
        Intent abridor = new Intent(this.getApplicationContext(),result.class);

        String aux1 = etBase.getText().toString();
        String aux2 = etAltura.getText().toString();

        int base = Integer.parseInt(aux1);
        int altura = Integer.parseInt(aux2);
        float resultado = (float) (base*altura);

        abridor.putExtra("resposta",resultado);
        abridor.putExtra("op",2);

        startActivity(abridor);
    }
}

package com.univali.anthonypiva.calcareas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MainActivity extends Activity {

    private RadioGroup Opssa1;
    private RadioButton Circ;
    private RadioButton Retan;
    private RadioButton Trian;
    private Button Continua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Opssa1 = (RadioGroup) findViewById(R.id.Opssa1);
        Circ = (RadioButton) findViewById(R.id.Circ);
        Retan = (RadioButton) findViewById(R.id.Retan);
        Trian = (RadioButton) findViewById(R.id.Trian);
        Continua = (Button) findViewById(R.id.Prox);
    }

    public void clicouContinuar(View clique){
        Intent abridor;

        int idRBSelecionado = Opssa1.getCheckedRadioButtonId();
        RadioButton opcaoSelecionada = (RadioButton) findViewById(idRBSelecionado);
        if(opcaoSelecionada.getText().toString().equals("Circulo")){
            abridor = new Intent(this.getApplicationContext(), circ.class);
        }else if(opcaoSelecionada.getText().toString().equals("Retângulo")){
            abridor = new Intent(this.getApplicationContext(), retan.class);
        }else{
            abridor = new Intent(this.getApplicationContext(), trian.class);
        }
        startActivity(abridor);
    }
}

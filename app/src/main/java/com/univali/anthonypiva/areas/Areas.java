package com.univali.anthonypiva.areas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Areas extends AppCompatActivity {

    private RadioGroup rgOpcao;
    private RadioButton rbCirculo;
    private RadioButton rbRetangulo;
    private RadioButton rbTriangulo;
    private Button btContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas);

        rgOpcao = (RadioGroup) findViewById(R.id.rgOpcao);
        rbCirculo = (RadioButton) findViewById(R.id.rbCirculo);
        rbRetangulo = (RadioButton) findViewById(R.id.rbRetangulo);
        rbTriangulo = (RadioButton) findViewById(R.id.rbTriangulo);
        btContinuar = (Button) findViewById(R.id.botaoAvancar);

    }

    public void clicouContinuar(View clique){
        Intent abridor;

        int idRBSelecionado = rgOpcao.getCheckedRadioButtonId();
        RadioButton opcaoSelecionada = (RadioButton) findViewById(idRBSelecionado);
        if(opcaoSelecionada.getText().toString().equals("Circulo")){
            abridor = new Intent(this.getApplicationContext(), circulo.class);
        }else if(opcaoSelecionada.getText().toString().equals("Retângulo")){
            abridor = new Intent(this.getApplicationContext(), retan.class);
        }else{
            abridor = new Intent(this.getApplicationContext(), triang.class);
        }
        startActivity(abridor);
    }

}

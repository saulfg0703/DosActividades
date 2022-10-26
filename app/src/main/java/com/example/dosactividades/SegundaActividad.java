package com.example.dosactividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {
    private String textoEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_main);
        Bundle datos = getIntent().getExtras();
        TextView textoFinal = (TextView)findViewById(R.id.TextoIntroducido);
        if(datos!= null){
            textoEntrada = datos.getString("textoPrimero");
            textoFinal.setText(textoEntrada);
        }else{
            textoFinal.setText("Hay problemas.");
        }
    }
    public void atras(View vista){
        Intent i = new Intent(this,MainActivity.class);
        EditText texto2 = (EditText) findViewById(R.id.texto2);
        i.putExtra("textoSegundo",texto2.getText().toString());
        startActivity(i);
        finish();
    }
}

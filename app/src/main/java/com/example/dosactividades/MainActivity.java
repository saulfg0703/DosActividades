package com.example.dosactividades;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textoFinal = (TextView)findViewById(R.id.textoRespuesta);
        Bundle datos = getIntent().getExtras();
        if(datos!= null){
            textoFinal.setText(datos.getString("textoSegundo"));
        }
    }
    public void siguiente(View vista){
        EditText texto = (EditText) findViewById(R.id.Texto);
        Intent i = new Intent(this,SegundaActividad.class);
        i.putExtra("textoPrimero", texto.getText().toString());
        startActivity(i);
    }
}
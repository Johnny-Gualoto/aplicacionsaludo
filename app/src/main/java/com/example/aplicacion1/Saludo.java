package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class Saludo extends AppCompatActivity {

    private TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        mensaje=findViewById(R.id.txtSaludo);

    }

    public void saludar(View v){
        mensaje.setText("Hola");
    }
}
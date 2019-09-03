package com.arnaldo.app_parametro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.arnaldo.app_parametro.R;

public class Main2Activity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola " + dato);
    }

    //Metodo regresar
    public void Regresar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

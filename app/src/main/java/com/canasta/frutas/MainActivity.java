package com.canasta.frutas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listDatos;
    RecyclerView recycler;


    Button comenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comenzar = (Button) findViewById(R.id.comenzar);

    }

    public void comenzar(View view){
        Intent comenzar = new Intent(MainActivity.this,ListaActivity.class);
        startActivity(comenzar);
    }
}



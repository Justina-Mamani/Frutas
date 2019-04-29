package com.canasta.frutas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class ListaActivity extends AppCompatActivity {

    ArrayList<Fruta> listFrutas = new ArrayList<>();
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        recycler = (RecyclerView) findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarFrutas();
        AdapterDatos adapter=new AdapterDatos(this,listFrutas);

        recycler.setAdapter(adapter);

    }

    private void llenarFrutas() {
        listFrutas.add(new Fruta("PIÑA",R.drawable.pina,"15 Bs","1"));
        listFrutas.add(new Fruta("UVA",R.drawable.uva,"10 Bs","2"));
        listFrutas.add(new Fruta("CHIRIMOYA",R.drawable.chirimoya,"10 Bs","3"));
        listFrutas.add(new Fruta("DURAZNO",R.drawable.durazno,"25x8 Bs","4"));
        listFrutas.add(new Fruta("FRUTILLA",R.drawable.frutilla,"1(caja)x7 Bs","5"));
        listFrutas.add(new Fruta("KIWI",R.drawable.kiwi,"25x Bs","6"));
        listFrutas.add(new Fruta("MANDARINA",R.drawable.mandarina,"25x13 Bs","7"));
        listFrutas.add(new Fruta("NARANJA",R.drawable.naranja,"25x12 Bs","8"));
        listFrutas.add(new Fruta("MANZANA",R.drawable.manzana,"5x10 Bs","9"));
    }
}

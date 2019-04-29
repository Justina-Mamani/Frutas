package com.canasta.frutas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    private ArrayList <Fruta> listFrutas;
    private Context mcontext;


    public AdapterDatos(Context context, ArrayList<Fruta> listFrutas) {
        this.listFrutas = listFrutas;
        this.mcontext = context;
    }


    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_item,null,false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, final int position) {

        viewHolderDatos.nombre.setText(listFrutas.get(position).getNombre());
        viewHolderDatos.imagen.setImageResource(listFrutas.get(position).getImagen());
        viewHolderDatos.precio.setText(listFrutas.get(position).getPrecio());
        viewHolderDatos.id.setText(listFrutas.get(position).getId());
        viewHolderDatos.detalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = listFrutas.get(position).getNombre();
                String precio = listFrutas.get(position).getPrecio();
                String id = listFrutas.get(position).getId();
                int imagen = listFrutas.get(position).getImagen();

                Intent intent= new Intent(mcontext,DetailsActivity.class);
                intent.putExtra("name",nombre);
                intent.putExtra("price",precio);
                intent.putExtra("id",id);
                intent.putExtra("image",imagen);
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFrutas.size();
    }


    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre, id, precio;
        ImageView imagen;
        LinearLayout detalles;
        ArrayList <Fruta> listFrutas;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.fruitname);
            imagen = (ImageView) itemView.findViewById(R.id.fruitimage);
            id = (TextView) itemView.findViewById(R.id.fruitid);
            precio = (TextView) itemView.findViewById(R.id.fruitprice);
            detalles = (LinearLayout) itemView.findViewById(R.id.detalles);
        }

    }
}



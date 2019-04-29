package com.canasta.frutas;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView frutanombre, frutaprecio,frutaid;
    ImageView frutaimagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        recibirDatos();
    }

    private void recibirDatos() {
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("name");
        String precio = extras.getString("price");
        String id = extras.getString("id");
        int imagen = extras.getInt("image");

        frutanombre.findViewById(R.id.nombrefruta);
        frutanombre.setText(nombre);

        frutaimagen.findViewById(R.id.imagenfruta);
        frutaimagen.setImageResource(imagen);

        frutaprecio.findViewById(R.id.fruitprice);
        frutaprecio.setText(precio);

        frutaid.findViewById(R.id.fruitid);
        frutaid.setText(id);

    }


}

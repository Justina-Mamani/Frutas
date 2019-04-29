package com.canasta.frutas;

import java.io.Serializable;

public class Fruta implements Serializable {

    private String nombre,precio,id;
    private int imagen;
    public Fruta(){

    }

    public Fruta(String nombre, int imagen, String precio, String id) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.id =id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}

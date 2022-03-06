package Entidades;

import android.media.Image;

public class Producto {
    private String nombre;
    private String precio;
    private String categoria;
    private int imagen;

    public Producto (String nombre, String precio, String categoria, int imagen){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.imagen=imagen;
    }
}

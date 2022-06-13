package Entidades;

import android.media.Image;

public class Producto {
    private String nombre;
    private int precio;
    private String categoria;
    private int imagen;

    public Producto (String nombre, int precio, String categoria, int imagen){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getImagen() {
        return imagen;
    }
}

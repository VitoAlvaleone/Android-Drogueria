package Controlador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practica2trimestre.R;

import java.util.ArrayList;

import Entidades.Producto;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Producto> listado;
    private int productos;
    TextView textnombre;
    ImageView img;



    public Adapter(Context context, ArrayList<Producto> listado, int productos) {
        this.context = context;
        this.listado = listado;
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return listado.size();
    }

    @Override
    public Object getItem(int i) {
        return listado.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        Producto producto = (Producto) getItem(i);
        view = inflater.inflate(productos, null);
        img = view.findViewById(R.id.imagenProducto);
        textnombre = view.findViewById(R.id.descripcionProducto);

        img.setImageResource(producto.getImagen());
        textnombre.setText(producto.getNombre());
        return view;
    }

}


package Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.practica2trimestre.R;

import java.util.ArrayList;

import Entidades.Producto;

public class ListadoDeProducto extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Controlador controlador = new Controlador();
    ListView listado;
    ArrayList<Producto> listaProductos = controlador.listaProducto();
    Adapter miAdapter;
    int productos;
    ArrayList<Producto> cestaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_producto);
        listado = findViewById(R.id.listaReciclada);
        productos = R.layout.productos;
        miAdapter = new Adapter(this, listaProductos, productos);
        listado.setAdapter(miAdapter);
        listado.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Producto producto = listaProductos.get(i);
        cestaProductos.add(producto);

    }
}
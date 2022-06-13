package Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.practica2trimestre.R;

import java.util.ArrayList;

import Entidades.Producto;

public class ListadoDeProducto extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    Controlador controlador = new Controlador();
    ListView listado;
    ArrayList<Producto> listaProductos = controlador.listaProducto();
    Adapter miAdapter;
    Bundle datos;
    String correoUsuario;
    Button boton;
    int productos;
    int precio=0;
    ArrayList<String> cestaProductos= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_producto);
        listado = findViewById(R.id.listaReciclada);
        productos = R.layout.productos;
        datos=getIntent().getExtras();
        correoUsuario=datos.getString("correoUsuario");
        miAdapter = new Adapter(this, listaProductos, productos);
        boton = findViewById(R.id.botonCesta);
        boton.setOnClickListener(this);
        listado.setAdapter(miAdapter);
        listado.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Producto producto = listaProductos.get(i);
        cestaProductos.add(producto.getNombre());
        precio+=producto.getPrecio();
    }

    @Override
    public void onClick(View v) {
        Intent acceso = new Intent(ListadoDeProducto.this, CestaCompra.class);
        acceso.putExtra("cesta", cestaProductos);
        acceso.putExtra("precio", precio);
        acceso.putExtra("correoUsuario", correoUsuario);
        startActivity(acceso);
    }
}
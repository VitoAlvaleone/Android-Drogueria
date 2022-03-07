package Controlador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica2trimestre.R;

import java.util.ArrayList;

import Entidades.ListaProducto;

public class ListadoDeProducto extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ListaProducto> listaProductos;
    Adapter miAdapter;
    String[] descripcionProducto;
    int[] imagenProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_producto);
        recyclerView = findViewById(R.id.listaReciclada);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        listaProductos = new ArrayList<ListaProducto>();
        miAdapter = new Adapter(this,listaProductos);
        recyclerView.setAdapter(miAdapter);

        descripcionProducto = new String[]{
                "Desodorante Nivea",
                "Champú H&S",
                "Colonia Bambú",
                "Colonia 960",
                "Lejía",
                "Fairy"
        };

        imagenProducto = new int[]{
                R.drawable.nivea,
                R.drawable.hs,
                R.drawable.bambu,
                R.drawable.mercadonacolonia,
                R.drawable.lejia,
                R.drawable.fairy
        };

        getData();
    }

    private void getData() {

        for (int i =0;i<descripcionProducto.length;i++){
            ListaProducto listado = new ListaProducto(descripcionProducto[i], imagenProducto[i]);
            listaProductos.add(listado);
        }

        miAdapter.notifyDataSetChanged();

    }
}
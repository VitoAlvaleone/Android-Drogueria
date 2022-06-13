package Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.practica2trimestre.R;

import java.util.ArrayList;

public class CestaCompra extends AppCompatActivity implements View.OnClickListener {
    Bundle datos;
    String correoUsuario;
    int precioTotal;
    ListView lista;
    TextView total, mensaje;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cestacompra);
        datos=getIntent().getExtras();
        correoUsuario = datos.getString("correoUsuario");
        ArrayList<String> nombreProductos=(ArrayList<String>)getIntent().getSerializableExtra("cesta");
        precioTotal = datos.getInt("precio");
        lista = findViewById(R.id.listaProductos);
        total=findViewById(R.id.totalCesta);
        total.setText(String.valueOf(precioTotal)+"€");
        mensaje = findViewById(R.id.mensajeCorreoEnviado);
        boton=findViewById(R.id.botonPagar);
        boton.setOnClickListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombreProductos);
        lista.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        mensaje.setText("Factura enviada al correo "+correoUsuario);
    }
}
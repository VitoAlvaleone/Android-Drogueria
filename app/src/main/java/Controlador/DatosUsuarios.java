package Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practica2trimestre.R;

public class DatosUsuarios extends AppCompatActivity implements View.OnClickListener {
    TextView nombre, apellido, correo, huecoNombre, huecoApellido, cambios;
    EditText huecoCorreo;
    Button guardar, confirmar;
    Bundle datos;
    String valor;
    Controlador controlador = new Controlador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controlador.listaUsuario();
        setContentView(R.layout.activity_datos_usuarios);
        nombre=findViewById(R.id.Nombre);
        apellido=findViewById(R.id.Apellido);
        correo=findViewById(R.id.Correo);
        huecoNombre=findViewById(R.id.huecoNombre);
        huecoApellido=findViewById(R.id.huecoApellido);
        huecoCorreo=findViewById(R.id.huecoCorreo);
        cambios=findViewById(R.id.cambios);
        guardar=findViewById(R.id.guardar);
        confirmar=findViewById(R.id.confirmar);
        guardar.setOnClickListener(this);
        confirmar.setOnClickListener(this);
        datos=getIntent().getExtras();
        valor = datos.getString("usuario");
        String[] datos=controlador.mostrarDatos(valor);
        huecoNombre.setText(datos[0]);
        huecoApellido.setText(datos[1]);
        huecoCorreo.setText(datos[2]);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.guardar:
                String nuevoCorreo = huecoCorreo.getText().toString();
                controlador.cambiarcorreo(nuevoCorreo, valor);
                String[] datos=controlador.mostrarDatos(valor);
                cambios.setText(datos[2]);
                break;
            case R.id.confirmar:
                String correo = String.valueOf(huecoCorreo.getText());
                Intent acceso = new Intent(DatosUsuarios.this, ListadoDeProducto.class);
                acceso.putExtra("correoUsuario", correo);
                startActivity(acceso);
                break;
        }
    }
}
package Controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practica2trimestre.R;

public class DatosUsuarios extends AppCompatActivity implements View.OnClickListener {
    TextView nombre, apellido, correo, huecoNombre, huecoApellido;
    EditText huecoCorreo;
    Button guardar, confirmar;
    Controlador controlador = new Controlador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuarios);
        nombre=findViewById(R.id.Nombre);
        apellido=findViewById(R.id.Apellido);
        correo=findViewById(R.id.Correo);
        huecoNombre=findViewById(R.id.huecoNombre);
        huecoApellido=findViewById(R.id.huecoApellido);
        huecoCorreo=findViewById(R.id.huecoCorreo);
        guardar=findViewById(R.id.guardar);
        confirmar=findViewById(R.id.confirmar);
        guardar.setOnClickListener(this);
        confirmar.setOnClickListener(this);
        String[] datos=controlador.mostrarDatos();
        nombre.setText(datos[1]);
        apellido.setText(datos[2]);
        correo.setText(datos[3]);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.guardar:

                break;
            case R.id.confirmar:
                break;
        }
    }
}
package Controlador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica2trimestre.R;

public class Login extends AppCompatActivity implements View.OnClickListener {
    ImageView imagen;
    TextView texto, resultado;
    EditText introduceNombre, introduceContraseña;
    Button boton;
    String nombreUsuario;
    String contraseña;
    Controlador controlador = new Controlador();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        imagen=findViewById(R.id.logo);
        texto=findViewById(R.id.nombreEmpresa);
        resultado = findViewById(R.id.error);
        introduceNombre=findViewById(R.id.usuario);
        introduceContraseña=findViewById(R.id.contraseña);
        boton=findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        nombreUsuario=introduceNombre.getText().toString();
        contraseña=introduceContraseña.getText().toString();
        boolean bool=controlador.comprueba(nombreUsuario, contraseña);
        String result = "";
        if (bool) {
            Intent acceso = new Intent(this, DatosUsuarios.class);
            startActivity(acceso);
        } else {
            result="acceso denegado";
        }
        resultado.setText(result);
    }
}
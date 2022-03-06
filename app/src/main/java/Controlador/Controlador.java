package Controlador;

import com.example.practica2trimestre.R;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import Entidades.Persona;
import Entidades.Producto;

public class Controlador {
    String Nombre;
    List<Persona> listaUsuario = new ArrayList<>();
    //                                                              PRIMERA ACTIVIDAD
    public List<Persona> listaUsuario(){

        listaUsuario.add(new Persona("VitoAlvaleone", "Vitoguapo", "vitoguapo@outlook.es", "Vito", "Ortega Jimenez"));
        listaUsuario.add(new Persona("Guille", "tlouapesta", "sonier@sony.com", "Guillermo", "Galvez Lucerna"));
        listaUsuario.add(new Persona("German", "lasdiscosnomolan", "mentalidadtiburon@tiburon.es", "Germán", "De bustamante"));
        listaUsuario.add(new Persona("Antonio", "eldenringapesta", "pokemaniaco@pokemon.es", "Antonio", "candela"));
        listaUsuario.add(new Persona("a", "a","a", "a", "a"));
        return listaUsuario;
    }

    public boolean comprueba(String usuario, String contraseña){
        boolean acceso=false;
        listaUsuario();
        for (Persona persona : listaUsuario){
            String usuarioBD;
            String contraseñaBD;
            usuarioBD=persona.getUsuario();
            contraseñaBD=persona.getContraseña();
            if (usuario.equals(usuarioBD)&&contraseña.equals(contraseñaBD)){
                Nombre=usuarioBD;
                acceso=true;
            }
        }
        return acceso;
    }

    //                                                              SEGUNDA ACTIVIDAD

    public String[] mostrarDatos(){
        String nombre;
        String apellido;
        String correo;
        listaUsuario();
        String[] Datos = new String[3];
        for (Persona persona : listaUsuario){
            String usuario=persona.getUsuario();
            if (Nombre.equals(usuario)){
                nombre=persona.getNombre();
                apellido=persona.getApellido();
                correo=persona.getCorreo();
                Datos[1]=nombre;
                Datos[2]=apellido;
                Datos[3]=correo;
            }
        }
        return Datos;
    }

    public List<Producto> listaProducto(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("cocacola", "2€", "bebida", R.drawable.cocacola));
        return listaProducto;
    }
}

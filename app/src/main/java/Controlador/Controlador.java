package Controlador;

import com.example.practica2trimestre.R;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import Entidades.Persona;
import Entidades.Producto;

public class Controlador {
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

        for (Persona persona : listaUsuario){
            String usuarioBD;
            String contraseñaBD;
            usuarioBD=persona.getUsuario();
            contraseñaBD=persona.getContraseña();
            if (usuario.equals(usuarioBD)&&contraseña.equals(contraseñaBD)){
                acceso=true;
            }
        }
        return acceso;
    }

    //                                                              SEGUNDA ACTIVIDAD

    public String[] mostrarDatos(String nombreUsuario){
        String nombre = "";
        String apellido = "";
        String correo = "";

        String[] Datos = new String[3];
        for (Persona persona : listaUsuario){
            String usuario=persona.getUsuario();
            if (nombreUsuario.equals(usuario)){
                nombre=persona.getNombre();
                apellido=persona.getApellido();
                correo=persona.getCorreo();
            }
        }
        try{
            Datos[0]=nombre;
            Datos[1]=apellido;
            Datos[2]=correo;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return Datos;
    }

    public void cambiarcorreo(String correo, String nombreUsuario){
        for (Persona persona: listaUsuario){
            String usuario = persona.getUsuario();
            if (nombreUsuario.equals(usuario)){
                persona.setCorreo(correo);
            }
        }
    }

    public List<Producto> listaProducto(){
        List<Producto> listaProducto = new ArrayList<>();
        listaProducto.add(new Producto("Desodorante Nivea", "2€", "Higiene Personal", R.drawable.nivea));
        listaProducto.add(new Producto("Champú H&S", "2€", "Higiene Personal", R.drawable.hs));
        listaProducto.add(new Producto("Colonia Bambú", "15€", "Perfumería", R.drawable.bambu));
        listaProducto.add(new Producto("Colonia 960", "6€", "Perfumería", R.drawable.mercadonacolonia));
        listaProducto.add(new Producto("Lejía", "3€", "Limpieza del hogar", R.drawable.lejia));
        listaProducto.add(new Producto("Fairy", "1€", "Limpieza del hogar", R.drawable.fairy));
        return listaProducto;
    }
}

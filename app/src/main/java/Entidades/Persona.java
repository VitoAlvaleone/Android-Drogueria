package Entidades;

public class Persona {
    String usuario;
    String contraseña;
    String correo;
    String Nombre;
    String Apellido;

    public Persona(String usuario, String contraseña, String correo, String nombre, String apellido){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.correo=correo;
        this.Nombre=nombre;
        this.Apellido=apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() { return correo; }

    public String getNombre() { return Nombre; }

    public String getApellido() { return Apellido; }
}

import java.util.Date;

public class Cuenta extends Usuario {
    Usuario usuario;
    Rol rol;
    Boolean estado;

    public Cuenta(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña, Usuario usuario1, Rol rol, Boolean estado) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email, usuario, contraseña);
        this.usuario = usuario1;
        this.rol = rol;
        this.estado = estado;
    }

    }


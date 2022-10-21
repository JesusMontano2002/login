public class Privilegios {
    Funcionalidad funcionalidad;
    Rol rol;

    public Funcionalidad getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(Funcionalidad funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Privilegios(Funcionalidad funcionalidad, Rol rol) {
        this.funcionalidad = funcionalidad;
        this.rol = rol;


    }

    @Override
    public String toString() {
        return "Privilegios{" +
                "funcionalidad=" + funcionalidad +
                ", rol=" + rol +
                '}';
    }
}

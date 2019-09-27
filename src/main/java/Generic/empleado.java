package Generic;
public class empleado {
    protected int legajo;
    protected String dni;
    protected String nombre,apellido;

    public empleado(int legajo, String dni, String nombre, String apellido) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "empleado{" + "legajo=" + legajo + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}

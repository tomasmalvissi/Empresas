package Extends;

import Generic.empleado;

public class efectivo extends empleado{
    protected int antig;
    protected double basico;
    protected boolean reparto;
    
    public efectivo(int legajo, String dni, String nombre, String apellido) {
        super(legajo, dni, nombre, apellido);
    }

    public efectivo(int antig, double basico, boolean reparto, int legajo, String dni, String nombre, String apellido) {
        super(legajo, dni, nombre, apellido);
        this.antig = antig;
        this.basico = basico;
        this.reparto = reparto;
    }

    public int getAntig() {
        return antig;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public boolean isReparto() {
        return reparto;
    }

    public void setReparto(boolean reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "efectivo{" + "antig=" + antig + ", basico=" + basico + ", reparto=" + reparto + '}';
    }
    
    public double calcularSalario(){
        double resp=0;
        return resp;        
    }
    
}

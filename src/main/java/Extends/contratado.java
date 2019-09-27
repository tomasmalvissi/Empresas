package Extends;

import Generic.empleado;

public class contratado extends empleado {
    protected int categoria, cantHs;
    
    public contratado(int legajo, String dni, String nombre, String apellido) {
        super(legajo, dni, nombre, apellido);
    }

    public contratado(int categoria, int CantHs, int legajo, String dni, String nombre, String apellido) {
        super(legajo, dni, nombre, apellido);
        this.categoria = categoria;
        this.cantHs = CantHs;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCantHs() {
        return cantHs;
    }

    public void setCantHs(int CantHs) {
        this.cantHs = CantHs;
    }

    @Override
    public String toString() {
        return "contratado{" + "categoria=" + categoria + ", CantHs=" + cantHs + '}';
    }
    public double calcularSalario(){
        double resp=0;
        switch (categoria){
            case 1:
                resp = cantHs*20.5;
                break;
            case 2:
                resp = cantHs*25.75;
                break;
            case 3:
                resp = cantHs*30.25;
                break;              
        }
        return resp;
    }   
}

package Modelos;

public class Empleado {
    private String legajo;
    private String nombre;

    public Empleado(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public void trabajar(){
        System.out.println("trabajando");
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

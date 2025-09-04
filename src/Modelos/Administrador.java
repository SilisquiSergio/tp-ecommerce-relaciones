package Modelos;

public class Administrador extends Empleado {

    public Administrador(String nombre,String legajo){
        super(nombre,legajo);
    }

    public void generarReporteVentas(){
        System.out.println("generar reportes de ventas");
    }
}

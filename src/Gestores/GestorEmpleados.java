package Gestores;

import Modelos.Administrador;
import Modelos.Empleado;
import Modelos.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {

    //Lista interna y estatica
    private static List<Empleado> empleados = new ArrayList<>();

    //Crear Administrados
    public static Administrador crearAdministrador(String legajo, String nombre) {
        Administrador admin = new Administrador(legajo,nombre);
        empleados.add(admin);
        return admin;
    }
    // Crear Vendedor
    public static Vendedor crearVendedor(String legajo, String nombre) {
        Vendedor vend = new Vendedor(legajo,nombre);
        empleados.add(vend);
        return vend;
    }
    // Buscar por legajo
    public static Empleado buscarPorLegajo(String legajo){
        for (Empleado e : empleados) {
            if (e.getLegajo().equals(legajo)) {
                return e;
            }
        }
        return null;
    }

    // Listar todos los empleados
    public static List<Empleado> listar() {
        return new ArrayList<>(empleados);
    }
}

package Gestores;

import Modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class GestorProductos {

    //Lista interna y estatica
    private static List<Producto> productos = new ArrayList<>();

    //Crear usuario
    public static void crear(Producto p) {
        productos.add(p);
    }

    // Buscar por sku
    public static Producto buscarPorSku(String sku) {
        for (Producto p : productos) {
            if (p.getSku().equals(sku)) {
                return p;
            }
        }
        return null;
    }

    // Buscar por nombre
    public static List<Producto> buscarPorNombre(String nombre) {
        List<Producto> resultados = new ArrayList<>();
        for (   Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    // Modificar precio
    public static void modificarPrecio(String sku, Double nuevoPrecio) {
        Producto p = buscarPorSku(sku);
        if (p != null) {
            p.setPrecio(nuevoPrecio);
        }
    }

    // Activar
    public static void activar(String sku) {
        Producto p = buscarPorSku(sku);
        if (p != null) {
            p.setActivo(true);
        }
    }

    // Desactivar
    public static void desactivar(String sku) {
        Producto p = buscarPorSku(sku);
        if (p != null) {
            p.setActivo(false);
        }
    }

    // Listar todos los productos
    public static List<Producto> listar() {
        return new ArrayList<>(productos); // devuelve copia para no exponer la lista interna
    }

}

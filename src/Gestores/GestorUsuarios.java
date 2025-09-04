package Gestores;

import Modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {

    //Lista interna y estatica
    private static List<Usuario> usuarios = new ArrayList<>();

    //Crear usuario
    public static void crear(Usuario u) {
        usuarios.add(u);
    }

    // Buscar por id
    public static Usuario buscarPorId(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    // Buscar por nombre
    public static List<Usuario> buscarPorNombre(String nombre) {
        List<Usuario> resultados = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(u);
            }
        }
        return resultados;
    }

    // Modificar email
    public static void modificarEmail(String id, String nuevoEmail) {
        Usuario u = buscarPorId(id);
        if (u != null) {
            u.setEmail(nuevoEmail);
        }
    }

    // Listar todos los usuarios
    public static List<Usuario> listar() {
        return new ArrayList<>(usuarios); // devuelve copia para no exponer la lista interna
    }

}

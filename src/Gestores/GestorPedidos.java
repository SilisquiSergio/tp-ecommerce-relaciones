package Gestores;

import Modelos.Pedido;
import Modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {

    //Lista interna y estatica
    private static List<Pedido> pedidos = new ArrayList<>();

    public static Pedido crearDesdeCarrito(Usuario u){
        Pedido pedido = u.checkout();
        pedidos.add(pedido);
        return pedido;
    }

    public static Pedido buscarNumero (String numero){
        for (Pedido p : pedidos) {
            if (p.getNumero().equals(numero)) {
                return p;
            }
        }
        return null;
    }

    public static List<Pedido> listarPorUsuario(String idUsuario) {
        List<Pedido> resultado = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getIdUsuario().equals(idUsuario)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // 5. Listar todos los pedidos
    public List<Pedido> listar() {
        return new ArrayList<>(pedidos);
    }

    public static List<Pedido> getPedidos() {
        return pedidos;
    }

    public static void setPedidos(List<Pedido> pedidos) {
        GestorPedidos.pedidos = pedidos;
    }
}

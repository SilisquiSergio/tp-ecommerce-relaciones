package ar.edu.unju.fi.ecommerce.app;

import Gestores.GestorPedidos;
import Gestores.GestorProductos;
import Gestores.GestorUsuarios;
import Modelos.*;

import java.text.SimpleDateFormat;
import java.util.List;

public class MainDemoEcommerce {

    public static void main(String[] args) {
        Usuario u = new Usuario("1","Sergio","sergiosilisqui@gmail.com");
        GestorUsuarios.crear(u);

        Producto p1 = new Producto("CEL-SAM-GS23-BLK","Samsung Galaxy S23",23000.00,true);
        Producto p2 = new Producto("LAP-DEL-XPS13-16GB","Laptop Dell XPS 13",42000.00,true);
        Producto p3 = new Producto("TV-LG-55-4K","Televisor LG 55",20000.00,true);
        Producto p4 = new Producto("AUD-SON-WF1000XM4","Audífonos Sony",17000.00,true);

        GestorProductos.crear(p1);
        GestorProductos.crear(p2);
        GestorProductos.crear(p3);
        GestorProductos.crear(p4);

        u.agregarAlCarrito(p1,3);
        u.agregarAlCarrito(p2,2);
        u.agregarAlCarrito(p3,1);
        u.agregarAlCarrito(p4,4);
        System.out.println();
        System.out.println("Detalles de Item Carrito");

        for (ItemCarrito item : u.getCarrito().getItems()) {
            System.out.println("============================================");
            System.out.println("Producto: " + item.getProducto().getNombre());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("============================================");
            System.out.println();

        }
        System.out.println("TOTAL CARRITO");

        System.out.println("total:" + u.getCarrito().total());


        GestorPedidos.crearDesdeCarrito(u);
        Pedido pedido = GestorPedidos.getPedidos().get(0);
        System.out.println();
        System.out.println("DETALLES DE PEDIDO");
        for (DetallePedido d : pedido.getDetalles()) {
            System.out.println("=============================================");
            System.out.println("Sku: " + d.getSku());
            System.out.println("Nombre: " + d.getNombreProducto());
            System.out.println("Cantidad: " + d.getCantidad());
            System.out.println("Precio unitario: " + d.getPrecioUnitario());
            System.out.println("=============================================");

            System.out.println();
        }

        System.out.println("TOTAL DESDE PEDIDO");
        System.out.println("total: " + pedido.total());

        System.out.println("ESTADO ANTES DE CONFIRMAR");
        System.out.println(pedido.getEstado());

        pedido.confirmar();
        System.out.println("ESTADO DESPUES DE CONFIRMAR");
        System.out.println(pedido.getEstado());

        List<Pedido> resultado = GestorPedidos.listarPorUsuario(u.getId());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        System.out.println("lISTADO POR USUARIO " +u.getNombre() );
        for(Pedido p: resultado){
            System.out.println("========================================");
            System.out.println("Numero: " + p.getNumero());
            System.out.println("Fecha: " + sdf.format(p.getFecha()));
            System.out.println("Estado: " + p.getEstado());

            System.out.println("========================================");
            System.out.println();
        }






    }
}

package ar.edu.unju.fi.ecommerce.app;

import Gestores.GestorPedidos;
import Gestores.GestorProductos;
import Gestores.GestorUsuarios;
import Modelos.*;

import java.text.SimpleDateFormat;

public class MainEmpleados {

    public static void main(String[] args){

        Administrador admin = new Administrador("Juan","23452");
        Vendedor vendedor = new Vendedor("Marcos","4532");

        System.out.println("Invocan los metodos trabajar");
        admin.trabajar();
        vendedor.trabajar();

        admin.generarReporteVentas();

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

        GestorPedidos.crearDesdeCarrito(u);
        Pedido pedido = GestorPedidos.getPedidos().get(0);


        Pedido p = vendedor.registrarPedido(pedido);
        System.out.println("PEDIDOS");
        System.out.println("==========================================");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        System.out.println("Numero: "+ p.getNumero());
        System.out.println("Fecha: "+sdf.format(p.getFecha()));
        System.out.println("Estado: " + p.getEstado());
        System.out.println("==========================================");
        System.out.println();

    }
}

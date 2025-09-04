package Modelos;

public class Vendedor extends Empleado{

    public Vendedor(String nombre,String legajo){
        super(nombre,legajo);
    }

    public Pedido registrarPedido( Pedido pedido){
        System.out.println("se registro pedido");
        return pedido;

    }
}

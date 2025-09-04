package Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

    //Atributos privados
    private String id;
    private String nombre;
    private String email;
    private CarritoDeCompras carrito = new CarritoDeCompras();
    private List<Pedido> pedidos = new ArrayList<>();
    private int numeroPedido;

    //Constructor
    public Usuario ( String id,String nombre,String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Pedido checkout(){

        List<ItemCarrito> items = new ArrayList<>();

        if (carrito.getItems().isEmpty()) {
            System.out.println("El carrito está vacío, no se puede generar un pedido.");
            return null;
        }

        numeroPedido = numeroPedido + 1;
        Pedido pedido = new Pedido(Integer.toString(numeroPedido),new Date(),EstadoPedido.CREADO,this.id);

        items = carrito.getItems();

        for(ItemCarrito item : items) {
            pedido.agregarDetalle(item.getProducto(),item.getCantidad(),item.getProducto().getPrecio());
        }
        pedidos.add(pedido);

        carrito.vaciar();

        return pedido;
    }

    //Operaciones
    public void agregarAlCarrito(Producto p,int cantidad){
        carrito.agregar(p,cantidad);
    }


    //Getter and Setter.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

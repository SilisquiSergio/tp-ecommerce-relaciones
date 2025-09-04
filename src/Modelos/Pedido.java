package Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    // Atributos
    private String numero;
    private Date fecha;
    private List<DetallePedido> detalles = new ArrayList<>();
    private EstadoPedido estado;
    private String idUsuario;

    // Constructor
    public Pedido(String numero, Date fecha, EstadoPedido estado,String idUsuario) {
        this.numero = numero;
        this.fecha = fecha;
        this.estado = estado;
        this.idUsuario = idUsuario;
    }

    // Agregar Detalle
    public void agregarDetalle(Producto p, int cantidad, Double precioUnit){
        detalles.add(new DetallePedido (p.getSku(),p.getNombre(), cantidad,precioUnit));
    }

    // Calcular Total
    public Double total(){
        Double t = 0.0;

        for (DetallePedido d : detalles) {
            t += d.subtotal();
        }
        return t;

    }

    // Confirmar
    public void confirmar(){
        this.estado = EstadoPedido.CONFIRMADO;
    }

    //Getters and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setUsuario(String usuario) {
        this.idUsuario = usuario;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}

package Modelos;
    // Relacion de dependencia con productos

public class DetallePedido {
    private String sku;
    private String nombreProducto;
    private Integer cantidad;
    private Double precioUnitario;

    public DetallePedido(String sku, String nombreProducto, Integer cantidad, Double precioUnitario) {
        this.sku = sku;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //Operaciones
    public double subtotal(){
        return this.cantidad * this.precioUnitario;

    }

    //Getters and Setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}

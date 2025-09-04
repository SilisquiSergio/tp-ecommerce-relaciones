package Modelos;

public class Producto {

    //Atriutos Privados
    private String sku;
    private String nombre;
    private Double precio;
    private Boolean activo;

    //Constructor
    public Producto(String sku, String nombre, Double precio, Boolean activo) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    //Getters y Setters
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }


}

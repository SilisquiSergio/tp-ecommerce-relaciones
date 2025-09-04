package Modelos;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ItemCarrito> items = new ArrayList <>();

    public void agregar(Producto p , int cantidad){
        items.add( new ItemCarrito(p, cantidad));
    }

    public void remover(Producto p){
        items.remove(p.getSku());
    }

    public Double total(){
        Double total = 0.0;

        for (ItemCarrito item : items) {
            total += item.subtotal();
        }
        return total;
    }

    public void vaciar(){
        items.clear();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }
}

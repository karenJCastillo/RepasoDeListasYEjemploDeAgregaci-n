package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int ID;

    // se almacenan los productyos aqui
    private List <Productos> productos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(int ID, List<Productos> productos) {
        this.ID = ID;
        this.productos = productos;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "ID=" + ID +
                ", productos=" + productos +
                '}';
    }
    public void agregarPedido (Productos productos){
        this.productos.add(productos); // aqui gregamos los productos a nuestra lista productos
    }
}

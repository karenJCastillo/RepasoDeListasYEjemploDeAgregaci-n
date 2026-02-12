package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Productos> listaTodosPedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(555,listaTodosPedidos);



        Productos producto1 = new Productos("camara",5.000);
        Productos producto2 = new Productos("cepillo",3.000);
        Productos producto3 = new Productos("celular",2.000);
        Productos producto4 = new Productos("computador",8000);

        pedido1.agregarPedido(producto1);
        pedido1.agregarPedido(producto2);
        pedido1.agregarPedido(producto3);
        pedido1.agregarPedido(producto4);

        // imprimir toda la lista



        System.out.println("ID del pedido"+pedido1.getID());
        System.out.println("productos del pedido");
        for (Productos x: listaTodosPedidos){

            System.out.println(x);
        }

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Compra {

    private Carrito carrito;
    private int numeroCompra;

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public Compra() {
    }

    public Compra(Carrito carrito, int numeroCompra) {
        this.carrito = carrito;
        this.numeroCompra = numeroCompra;
    }

    public void ImprimirFactura() {

    }
}

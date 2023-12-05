/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Carrito {

    private int idCarrito;
    private Usuarios usuario;
    private List<Producto> carrito;

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public Carrito() {
    }

    public Carrito(int idCarrito, Usuarios usuario, List<Producto> carrito) {
        this.idCarrito = idCarrito;
        this.usuario = usuario;
        this.carrito = carrito;
    }

    public void AgregarProducto() {

    }

    public void EliminarProducto() {

    }

    public void AumentarCantidad() {

    }

    public void CalcularTotal() {
        /**
         * El metodo se piensa poner como double en ves de void pero se dejo así
         * para que no marque error
         */
    }
}

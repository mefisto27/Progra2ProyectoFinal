/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Producto {

    private TipoProducto tipoProducto;
    private String nombre;
    private String marca;
    private int idProducto;
    private int cantidadDisponible;

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Producto() {
    }

    public Producto(TipoProducto tipoProducto, String nombre, String marca, int idProducto, int cantidadDisponible) {
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.idProducto = idProducto;
        this.cantidadDisponible = cantidadDisponible;
    }

}

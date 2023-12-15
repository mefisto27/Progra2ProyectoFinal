/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/*INSERT INTO Productos (TipoProducto,Nombre,IdProducto,CantidadDisponible)
VALUES ('LECHE', 'Leche Semidescremada', '65245543235', '24')*/
/**
 *
 * @author Usuario
 */
public class Producto {

    private String tipoProducto;
    private String nombre;
    private String marca;
    private String idProducto;
    private int cantidadDisponible;
    private int Precio;

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
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

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public Producto() {
    }

    public Producto(String tipoProducto, String nombre, String marca, String idProducto, int cantidadDisponible, int Precio) {
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.idProducto = idProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.Precio = Precio;
    }

   

}

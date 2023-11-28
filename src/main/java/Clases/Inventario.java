/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Inventario {

    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }
public Inventario() {
        // Inicializar la lista productos
        this.productos = new ArrayList<>();
        
        // Llamar al método para inicializar el inventario
        InicializarInventario();
    }




//poner constructor vacio
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void AgregarProducto(Producto producto) {
        productos.add(producto);
    }

    private void InicializarInventario() {
        Producto leche = new Producto("LACTEO", "Leche", "Marca Leche", 1, 50);
        Producto arroz = new Producto("CEREAL", "Arroz", "Marca Arroz", 2, 30);
        Producto gaseosa = new Producto("BEBIDA", "Gaseosa", "Marca Gaseosa", 3, 40);
        Producto licores = new Producto("LICOR", "Licores", "Marca Licores", 4, 25);
        Producto manzanas = new Producto("FRUTA", "Manzanas", "Marca Frutas", 5, 60);
        Producto yogurt = new Producto("LACTEO", "Yogurt", "Marca Yogurt", 6, 35);
        Producto pasta = new Producto("CEREAL", "Pasta", "Marca Pasta", 7, 28);
        Producto agua = new Producto("BEBIDA", "Agua", "Marca Agua", 8, 55);
        Producto vino = new Producto("LICOR", "Vino", "Marca Vino", 9, 18);
        Producto naranjas = new Producto("FRUTA", "Naranjas", "Marca Frutas", 10, 48);
        Producto queso = new Producto("LACTEO", "Queso", "Marca Queso", 11, 22);
        Producto maiz = new Producto("CEREAL", "Maíz", "Marca Maíz", 12, 33);
        Producto refresco = new Producto("BEBIDA", "Refresco", "Marca Refresco", 13, 42);
        Producto whisky = new Producto("LICOR", "Whisky", "Marca Whisky", 14, 15);
        Producto peras = new Producto("FRUTA", "Peras", "Marca Frutas", 15, 37);
        Producto mantequilla = new Producto("LACTEO", "Mantequilla", "Marca Mantequilla", 16, 29);
        Producto arvejas = new Producto("CEREAL", "Arvejas", "Marca Arvejas", 17, 50);
        Producto jugo = new Producto("BEBIDA", "Jugo", "Marca Jugo", 18, 45);
        Producto ron = new Producto("LICOR", "Ron", "Marca Ron", 19, 20);
        Producto uvas = new Producto("FRUTA", "Uvas", "Marca Frutas", 20, 55);
        AgregarProducto(leche);
        AgregarProducto(arroz);
        AgregarProducto(gaseosa);
        AgregarProducto(licores);
        AgregarProducto(manzanas);
        AgregarProducto(yogurt);
        AgregarProducto(pasta);
        AgregarProducto(agua);
        AgregarProducto(vino);
        AgregarProducto(naranjas);
        AgregarProducto(queso);
        AgregarProducto(maiz);
        AgregarProducto(refresco);
        AgregarProducto(whisky);
        AgregarProducto(peras);
        AgregarProducto(mantequilla);
        AgregarProducto(arvejas);
        AgregarProducto(jugo);
        AgregarProducto(ron);
        AgregarProducto(uvas);
    }
public void MostrarInventario() {
    System.out.println("Inventario:");
    for (Producto producto : productos) {
        System.out.println("ID: " + producto.getIdProducto() +
                           ", Nombre: " + producto.getNombre() +
                           ", Marca: " + producto.getMarca() +
                           ", Cantidad Disponible: " + producto.getCantidadDisponible());
    }
}

}

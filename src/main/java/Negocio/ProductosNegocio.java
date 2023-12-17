/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import AccesoDatos.ProductosData;
import AccesoDatos.iProductosData;
import Clases.Excepciones.ProductoExcepcion;
import Clases.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductosNegocio {

    private final iProductosData productosData;

    public ProductosNegocio() {
        productosData = new ProductosData();
    }

    public List<Producto> ConsultarProductos() throws ProductoExcepcion, Exception {
        return productosData.ConsultarProductos();
    }

    public Producto Consultar(String idProducto) throws ProductoExcepcion, Exception {
        return productosData.Consultar(idProducto);
    }
    /*
    public String Insertar(Producto producto) throws ProductoExcepcion, Exception {

    }

    public boolean Actualizar(Producto producto) throws ProductoExcepcion, Exception {

    }
*/
    public void Eliminar(String idProducto) throws ProductoExcepcion, Exception {
     productosData.Eliminar(idProducto);
    } 
}

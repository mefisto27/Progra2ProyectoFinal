/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AccesoDatos;

import Clases.Excepciones.ProductoExcepcion;
import Clases.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface iProductosData {

    List<Producto> ConsultarProductos() throws ProductoExcepcion, Exception;

    Producto Consultar(String idProducto) throws ProductoExcepcion, Exception;

    String Insertar(Producto producto) throws ProductoExcepcion, Exception;

    boolean Actualizar(Producto producto) throws ProductoExcepcion, Exception;

    void Eliminar(String idProducto) throws ProductoExcepcion, Exception;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Clases.Excepciones.ProductoExcepcion;
import Clases.Producto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProductosData implements iProductosData {

    @Override
    public List<Producto> ConsultarProductos() throws ProductoExcepcion, Exception {
        List<Producto> listaProductos = new ArrayList<>();
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT TipoProducto, Nombre, IdProducto, CantidadDisponible, Precio FROM Productos";
            ResultSet resultado = sql.executeQuery(query);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setTipoProducto(resultado.getString(1));
                producto.setNombre(resultado.getString(1));
                producto.setCantidadDisponible(resultado.getInt(3));
                producto.setPrecio(resultado.getInt(4));
                listaProductos.add(producto);
            }

            if (listaProductos.isEmpty()) {
                throw new ProductoExcepcion("No existen productos en el inventario");
            }

        } catch (ProductoExcepcion ex) {
            throw new ProductoExcepcion(ex.getMessage());
        } catch (Exception ex) {
            throw new ProductoExcepcion("No se retornaron productos, " + ex.getMessage());
        }
        return listaProductos;
    }

    @Override
    public Producto Consultar(String idProducto) throws ProductoExcepcion, Exception {
        Producto producto1 = null;
        try {

            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT TipoProducto, Nombre, IdProducto, CantidadDisponible, Precio FROM Productos";
            ResultSet resultado = sql.executeQuery(query);

            while (resultado.next()) {
                producto1 = new Producto();
                producto1.setTipoProducto(resultado.getString(1));
                producto1.setNombre(resultado.getString(1));
                producto1.setCantidadDisponible(resultado.getInt(3));
                producto1.setPrecio(resultado.getInt(4));
            }
        } catch (Exception e) {
            throw new ProductoExcepcion("El producto no pudo ser encontrado \n " + e.getMessage());
        }

        return producto1;
    }

    @Override
    public String Insertar(Producto producto) throws ProductoExcepcion, Exception {
         try {
            if (this.Consultar(producto.getIdProducto()) != null) {
                String insercion = "INSERT INTO Productos ([TipoProducto],[Nombre],[IdProducto],[CantidadDisponible],[Precio]) VALUES ('" + producto.getTipoProducto() + "','" + 
                        producto.getNombre() + "','" + producto.getIdProducto() + "'," + producto.getCantidadDisponible() + "," + producto.getPrecio() + ")";
                Statement sql = Conexion.getConexion().createStatement();
                sql.execute(insercion);

            } else {
                throw new ProductoExcepcion("El producto ya existe en el sistema");
            }

        } catch (Exception e) {
            throw new ProductoExcepcion("El producto no pudo ser ingresado \n " + e.getMessage());
        }
        return "El producto se ingreso correctamente";
    }
    

    @Override
    public boolean Actualizar(Producto producto) throws ProductoExcepcion, Exception {
         boolean resultado = false;
        try {

            if (this.Consultar(producto.getIdProducto()) != null) {
                String actualizacion = "UPDATE Productos SET [TipoProducto] = '" + producto.getTipoProducto() 
                        + "',[Nombre] = '" + producto.getNombre() 
                        + "',[Marca] = '" + producto.getMarca() 
                        + "',[IdProducto] = '" + producto.getIdProducto()
                        + "',[CantidadDisponible] = " + producto.getCantidadDisponible()
                        + ", [Precio] = " + producto.getPrecio()
                        + "' WHERE Nombre = '" + producto.getNombre() + "'";
                Statement sql = Conexion.getConexion().createStatement();
                sql.execute(actualizacion);
                resultado = true;
            } else {
                throw new ProductoExcepcion("El automovil no existe en el sistema");
            }

        } catch (Exception e) {
            throw new ProductoExcepcion("El automovil no pudo ser actualizado \n " + e.getMessage());
        }
        return true;
    }

    @Override
    public void Eliminar(String producto) throws ProductoExcepcion, Exception {
        try {

            if (this.Consultar(producto) != null) {
                String eliminacion = "DELETE Productos WHERE producto = '" + producto + "'";
                Statement sql = Conexion.getConexion().createStatement();
                sql.execute(eliminacion);
            } else {
                throw new ProductoExcepcion("El producto no existe en el sistema");
            }
        } catch (Exception e) {
            throw new ProductoExcepcion("El producto no pudo ser actualizado \n " + e.getMessage());
        }
    }

}

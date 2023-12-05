/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Clases.Excepciones.UsuarioExcepcion;
import Clases.Usuarios;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuariosData implements iUsuariosData {

    public List<Usuarios> ConsultarUsuarios() throws UsuarioExcepcion, Exception {
        List<Usuarios> listaUsuarios = new ArrayList<>();
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT Nombre,Apellido,Cedula,Direccion,Correo,Telefono,Contrasenna,TipoUsuario FROM Clientes";
            ResultSet resultado = sql.executeQuery(query);

            while (resultado.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setNombre(resultado.getString(1));
                usuario.setApellidos(resultado.getString(2));
                usuario.setCedula(resultado.getString(3));
                usuario.setDireccion(resultado.getString(4));
                usuario.setCorreo(resultado.getString(5));
                usuario.setTelefono(resultado.getInt(6));
                usuario.setContrasenna(resultado.getString(7));
                usuario.setTipoUsuario(resultado.getString(8));
                listaUsuarios.add(usuario);
            }

            if (listaUsuarios.isEmpty()) {
                throw new UsuarioExcepcion("No existen usuarios registrados");
            }

        } catch (UsuarioExcepcion ex) {
            throw new UsuarioExcepcion(ex.getMessage());
        } catch (Exception ex) {
            throw new UsuarioExcepcion("No se retornaron usuarios, " + ex.getMessage());
        }
        return listaUsuarios;
    }

    public Usuarios Cosultar(String usuario) throws UsuarioExcepcion, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String Insertar(Usuarios nombre) throws UsuarioExcepcion, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Actualizar(Usuarios nombre) throws UsuarioExcepcion, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void Eliminar(String usuario) throws UsuarioExcepcion, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

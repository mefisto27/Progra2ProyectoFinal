/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Clases.Excepciones.UsuarioExcepcion;
import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuariosData implements iUsuariosData {

    public List<Usuario> ConsultarUsuarios() throws UsuarioExcepcion, Exception {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT Nombre,Apellido,Cedula,Direccion,Correo,Telefono,TipoUsuario FROM Usuarios";
            ResultSet resultado = sql.executeQuery(query);

            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(resultado.getString(1));
                usuario.setApellidos(resultado.getString(2));
                usuario.setCedula(resultado.getString(3));
                usuario.setDireccion(resultado.getString(4));
                usuario.setCorreo(resultado.getString(5));
                usuario.setTelefono(resultado.getInt(6));
                usuario.setTipoUsuario(resultado.getString(7));
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

    public Usuario Consultar(String cedula) throws UsuarioExcepcion, Exception {
        Usuario usuario1 = null;
        try {

            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT Nombre,Apellido,Cedula,Direccion,Correo,Telefono,TipoUsuario FROM Usuarios";
            ResultSet resultado = sql.executeQuery(query);

            while (resultado.next()) {
                usuario1 = new Usuario();
                usuario1.setNombre(resultado.getString(1));
                usuario1.setApellidos(resultado.getString(2));
                usuario1.setCedula(resultado.getString(3));
                usuario1.setDireccion(resultado.getString(4));
                usuario1.setCorreo(resultado.getString(5));
                usuario1.setTelefono(resultado.getInt(6));
                usuario1.setTipoUsuario(resultado.getString(7));
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion("El usuario no pudo ser encontrado \n " + e.getMessage());
        }

        return usuario1;
    }

    public String Insertar(Usuario usuario) throws UsuarioExcepcion, Exception {
        try {

            if (this.Consultar(usuario.getCedula()) != null) {
                String insercion = "INSERT INTO Usuarios(Nombre,Apellido,Cedula,Direccion,Correo,Telefono,Contrasenna,TipoUsuario) VALUES('"
                        + usuario.getNombre() + "','"
                        + usuario.getApellidos() + "','"
                        + usuario.getCedula() + "','"
                        + usuario.getDireccion() + "','"
                        + usuario.getCorreo() + "',"
                        + usuario.getTelefono() + ",'"
                        + usuario.getContrasenna() + "','"
                        + usuario.getTipoUsuario() + "')";
                Statement sql = Conexion.getConexion().createStatement();
                sql.execute(insercion);

            } else {
                throw new UsuarioExcepcion("El usuario ya existe en el sistema");
            }

        } catch (Exception e) {
            throw new UsuarioExcepcion("El usuario no pudo ser ingresado \n " + e.getMessage());
        }
        return "El usuario se ingreso correctamente";
    }

    public boolean Actualizar(Usuario usuario) throws UsuarioExcepcion, Exception {
        boolean resultado = false;
        try {
            if (this.Consultar(usuario.getNombre()) != null) {
                String actualizacion = "";
                if (usuario.getContrasenna().isEmpty()) {
                    actualizacion = "UPDATE Usuarios SET  [Nombre] '" + usuario.getNombre()
                            + "',[Apellido] = '" + usuario.getApellidos()
                            + "',[Cedula] = '" + usuario.getCedula()
                            + "',[Direccion] = '" + usuario.getDireccion()
                            + "', [Correo] = '" + usuario.getCorreo()
                            + "',[Telefono] = " + usuario.getTelefono()
                            + "',[TipoUsuario] = '" + usuario.getTipoUsuario()
                            + "' WHERE Nombre = '" + usuario.getNombre() + "'";
                } else {
                    actualizacion = "UPDATE Usuarios SET [Contrasenna] = '" + usuario.getContrasenna()
                            + "',[Nombre] = '" + usuario.getNombre() + "',[Apellido] = '" + usuario.getApellidos()
                            + "',[Cedula] = '" + usuario.getCedula()
                            + "',[Direccion] = '" + usuario.getDireccion()
                            + "', [Correo] = '" + usuario.getCorreo()
                            + "',[Telefono] = " + usuario.getTelefono()
                            + "',[TipoUsuario] = '" + usuario.getTipoUsuario()
                            + "' WHERE Nombre = '" + usuario.getNombre() + "'";
                }
                Statement sql = Conexion.getConexion().createStatement();
                sql.executeUpdate(actualizacion);
                resultado = true;
            } else {
                throw new UsuarioExcepcion("El usuario no existe en el sistema");
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion("El usuario no pudo ser actualizado \n" + e.getMessage());
        }
        return resultado;
       
    }

    public void Eliminar(String usuario) throws UsuarioExcepcion, Exception {
        try {

            if (this.Consultar(usuario) != null) {
                String eliminacion = "DELETE Usuarios WHERE usuario = '" + usuario + "'";
                Statement sql = Conexion.getConexion().createStatement();
                sql.execute(eliminacion);
            } else {
                throw new UsuarioExcepcion("El usuario no existe en el sistema");
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion("El usuario no pudo ser actualizado \n " + e.getMessage());
        }
    }

    public boolean Login(Usuario usuario) throws UsuarioExcepcion, Exception {
        boolean bandera = false;
        try {
            Statement sql = Conexion.getConexion().createStatement();
            String query = "SELECT usuario,nombre,tipousuario FROM Usuarios WHERE usuario = '" + usuario.getCedula() + "' and Contrasenna = '" + usuario.getContrasenna() + "'";
            ResultSet resultado = sql.executeQuery(query);
            while (resultado.next()) {
                bandera = true;
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion("El usuario no pudo ser encontrado \n" + e.getMessage());
        }
        return bandera;
    }
}

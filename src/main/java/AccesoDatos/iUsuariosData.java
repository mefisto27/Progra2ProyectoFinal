/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AccesoDatos;

import Clases.*;
import Clases.Excepciones.UsuarioExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface iUsuariosData {

    List<Usuario> ConsultarUsuarios() throws UsuarioExcepcion, Exception;

    Usuario Consultar(String cedula) throws UsuarioExcepcion, Exception;

    String Insertar(Usuario usuario) throws UsuarioExcepcion, Exception;

    boolean Actualizar(Usuario usuario) throws UsuarioExcepcion, Exception;

    void Eliminar(String cedula) throws UsuarioExcepcion, Exception;
    
     boolean Login(Usuario usuario) throws UsuarioExcepcion, Exception;
}

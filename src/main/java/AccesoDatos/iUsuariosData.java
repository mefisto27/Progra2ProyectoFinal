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

    List<Usuarios> ConsultarUsuarios() throws UsuarioExcepcion, Exception;

    Usuarios Cosultar(String usuario) throws UsuarioExcepcion, Exception;

    String Insertar(Usuarios nombre) throws UsuarioExcepcion, Exception;

    boolean Actualizar(Usuarios nombre) throws UsuarioExcepcion, Exception;

    void Eliminar(String usuario) throws UsuarioExcepcion, Exception;
}

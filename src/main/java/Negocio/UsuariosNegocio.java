/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import AccesoDatos.*;
import Clases.Usuario;
import Clases.Excepciones.UsuarioExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuariosNegocio {

    private final iUsuariosData usuariosData;

    public UsuariosNegocio() {
        usuariosData = new UsuariosData();
    }

    public List<Usuario> ConsultarUsuarios() throws UsuarioExcepcion, Exception {
        return usuariosData.ConsultarUsuarios();
    }

    public String Insertar(Usuario usuario) throws UsuarioExcepcion, Exception {
        return usuariosData.Insertar(usuario);
    }

    public Boolean Actualizar(Usuario usuario) throws UsuarioExcepcion, Exception {
        return usuariosData.Actualizar(usuario);
    }

    public void Eliminar(String cedula) throws UsuarioExcepcion, Exception {
        usuariosData.Eliminar(cedula);
    }

    public boolean Login(Usuario usuario) throws UsuarioExcepcion, Exception {
        return usuariosData.Login(usuario);
    }
}

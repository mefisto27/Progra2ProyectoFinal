/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import AccesoDatos.*;
import Clases.Usuarios;
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

    public List<Usuarios> ConsultarUsuarios() throws UsuarioExcepcion, Exception {
        return usuariosData.ConsultarUsuarios();
    }
}

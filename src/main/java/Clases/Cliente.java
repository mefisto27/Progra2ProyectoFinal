/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Cliente extends Usuarios {

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String cedula, String direccion, String correo, int telefono, String contrasenna, String tipoUsuario) {
        super(nombre, apellidos, cedula, direccion, correo, telefono, contrasenna, tipoUsuario);
    }

    /**
     * Todavia no se va a añadir el to String hasta estar seguros que no se van
     * a agregar más atributos a la clase Cliente
     */
}

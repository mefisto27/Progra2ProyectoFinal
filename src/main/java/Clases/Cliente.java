/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Cliente extends Usuario{

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String cedula, Direccion direccion, String correo, int numeroTelefonico) {
        super(nombre, apellidos, cedula, direccion, correo, numeroTelefonico);
    }
     /**Todavia no se va a añadir el to String hasta estar seguros 
     * que no se van a agregar más atributos a la clase Cliente*/
}

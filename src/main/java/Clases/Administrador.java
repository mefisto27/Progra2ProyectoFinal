/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Administrador extends Usuario{
    private String tipoAdministrador;

    public String getTipoAdministrador() {
        return tipoAdministrador;
    }

    public void setTipoAdministrador(String tipoAdministrador) {
        this.tipoAdministrador = tipoAdministrador;
    }

    public Administrador() {
    }

    public Administrador(String tipoAdministrador, String nombre, String apellidos, String cedula, Direccion direccion, String correo, int numeroTelefonico) {
        super(nombre, apellidos, cedula, direccion, correo, numeroTelefonico);
        this.tipoAdministrador = tipoAdministrador;
    }
     /**Todavia no se va a añadir el to String hasta estar seguros 
     * que no se van a agregar más atributos a la clase Cliente*/
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Usuario {

    private String nombre;
    private String apellidos;
    private String cedula;
    private Direccion direccion;
    private String correo;
    private int numeroTelefonico;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String cedula, Direccion direccion, String correo, int numeroTelefonico, String tipoUsuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
       this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String nombre, String apellidos, String cedula, String correo, int numeroTelefonico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void CarritoCompras() {

    }

    public void RevisarHistorico() {

    }

    public void Comprar() {

    }
    /**
     * Todavia no se va a añadir el to String hasta estar seguros que no se van
     * a agregar más atributos a la clase Cliente
     */
}

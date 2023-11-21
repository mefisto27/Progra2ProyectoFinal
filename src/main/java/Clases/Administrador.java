/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Administrador extends Usuario {

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

    public Administrador(String tipoAdministrador, String nombre, String apellidos, String cedula, String correo, int numeroTelefonico) {
        super(nombre, apellidos, cedula, correo, numeroTelefonico);
        this.tipoAdministrador = tipoAdministrador;
    }

    public void Agregar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del nuevo usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos del nuevo usuario: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese la cédula del nuevo usuario: ");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese la direccion del nuevo usuario:");
        Direccion direccion = new Direccion();
        direccion.AgregarDireccion();
        System.out.println("Ingrese el correo del nuevo usuario:");
        String correo = scanner.nextLine();
        System.out.println("Ingrese el numero del nuevo usuario:");
        int numero = scanner.nextInt();
        Usuario nuevoUsuario = new Usuario(nombre, apellidos, cedula, direccion, correo, numero);

        // Agregar el nuevo usuario a la lista de clientes 
        List<Usuario> clientes = new ArrayList<>();
        clientes.add(nuevoUsuario);
        System.out.println("Usuario agregado correctamente.");
    }

    /**
     * Todavia no se va a añadir el to String hasta estar seguros que no se van
     * a agregar más atributos a la clase Cliente
     */
}

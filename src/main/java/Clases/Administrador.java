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

    public Administrador(String nombre, String apellidos, String cedula, Direccion direccion, String correo, int numeroTelefonico, String tipoUsuario) {
        super(nombre, apellidos, cedula, direccion, correo, numeroTelefonico, tipoUsuario);
       
    }

    public Administrador(String tipoAdministrador, String nombre, String apellidos, String cedula, String correo, int numeroTelefonico) {
        super(nombre, apellidos, cedula, correo, numeroTelefonico);
        this.tipoAdministrador = tipoAdministrador;
    }
public void AgregarUsuario(List<Usuario> usuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de usuario que desea agregar:");
        System.out.println("1. Cliente");
        System.out.println("2. Administrador");
        System.out.print("Ingrese la opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                AgregarCliente(usuarios);
                break;
            case 2:
                AgregarAdministrador(usuarios);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
     public void AgregarCliente(List<Usuario> usuarios) {
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
         System.out.println("Ingrese el tipo de usuario");
         String tipoUsuario = scanner.nextLine();
    Usuario nuevoUsuario = new Usuario(nombre, apellidos, cedula, direccion, correo, numero, tipoUsuario);

    // Agregar el nuevo usuario a la lista de clientes 
    usuarios.add(nuevoUsuario);
    System.out.println("Usuario agregado correctamente.");
}
       public void AgregarAdministrador(List<Usuario> usuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del nuevo administrador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos del nuevo administrador: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese la cédula del nuevo administrador: ");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el correo del nuevo administrador:");
        String correo = scanner.nextLine();
        System.out.println("Ingrese el número del nuevo administrador:");
        int numero = scanner.nextInt();

        // Puedes pedir más información específica para el administrador si es necesario
        System.out.println("Ingrese el tipo de administrador (vendedor, administrador, gerente): ");
        scanner.nextLine(); // Consumir el salto de línea
        String tipoAdmin = scanner.nextLine();

        // Agregar el nuevo administrador a la lista de usuarios
        Usuario nuevoAdmin = new Administrador(tipoAdmin, nombre, apellidos, cedula, correo, numero);
        usuarios.add(nuevoAdmin);
        System.out.println("Administrador agregado correctamente.");
    }

public void Editar(List<Usuario> clientes) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cédula del usuario a editar:");
    String cedula = scanner.nextLine();

    for (Usuario usuario : clientes) {
        if (usuario.getCedula().equals(cedula)) {
            System.out.println("Usuario encontrado. Ingrese los nuevos datos:");

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            usuario.setNombre(nuevoNombre);

            System.out.print("Nuevos apellidos: ");
            String nuevosApellidos = scanner.nextLine();
            usuario.setApellidos(nuevosApellidos);

            System.out.print("Nueva dirección:");
            Direccion nuevaDireccion = new Direccion();
            nuevaDireccion.AgregarDireccion();
            usuario.setDireccion(nuevaDireccion);

            System.out.print("Nuevo correo: ");
            String nuevoCorreo = scanner.nextLine();
            usuario.setCorreo(nuevoCorreo);

            System.out.print("Nuevo número telefónico: ");
            int nuevoNumero = scanner.nextInt();
            usuario.setNumeroTelefonico(nuevoNumero);

            System.out.println("Usuario editado correctamente.");
            return;
        }
    }

    System.out.println("No se encontró un usuario con la cédula proporcionada.");
}

    public void Eliminar(List<Usuario> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cédula de la persona a eliminar");
        String cedula = scanner.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            Usuario usuario = clientes.get(i);

            if (usuario.getCedula().equals(cedula)) {
                clientes.remove(i);
                System.out.println("Usuario eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró un usuario con la cédula proporcionada.");
    }
  public  void imprimirLista(List<Usuario> clientes) {
        for (Usuario usuario : clientes) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellidos() + " - " + usuario.getCedula());
        }
    /**
     * Todavia no se va a añadir el to String hasta estar seguros que no se van
     * a agregar más atributos a la clase Cliente
     */
}
}

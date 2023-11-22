/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoprogra2;

import Clases.Administrador;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

public class ProyectoProgra2 {

    public static void main(String[] args) {
        Administrador admin = new Administrador("Gerente", "Admin Nombre", "Admin Apellidos", "ID123", "admin@correo.com", 123456789);

        // Lista de usuarios
       List<Usuario> usuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Editar Usuario");
            System.out.println("4. Ver lista de Usuarios");
             System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                  admin.AgregarUsuario(usuarios);
                    break;
                case 2:
                       admin.Eliminar(usuarios);
                    break;
                case 3:
                    admin.Editar(usuarios);
                    break;
                case 4:
                    admin.imprimirLista(usuarios);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }
}
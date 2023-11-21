/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoprogra2;

import Clases.Administrador;

/**
 *
 * @author Usuario
 */
public class ProyectoProgra2 {

    public static void main(String[] args) {
       Administrador admin = new Administrador("Gerente", "Admin Nombre", "Admin Apellidos", "ID123" , "admin@correo.com", 123456789);
       //Prueba de la funcion agregar usuarios
        admin.Agregar();
    }
}

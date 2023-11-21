/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String codigoPostal;
    private String pais;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }
public void AgregarDireccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        this.calle = scanner.nextLine();

        System.out.print("Ingrese la ciudad: ");
        this.ciudad = scanner.nextLine();

        System.out.print("Ingrese el código postal: ");
        this.codigoPostal = scanner.nextLine();

        System.out.print("Ingrese el país: ");
        this.pais = scanner.nextLine();
}
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", pais=" + pais + '}';
    }
}

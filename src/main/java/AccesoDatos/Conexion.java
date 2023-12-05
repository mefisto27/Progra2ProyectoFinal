/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
      public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://CompuAndy:1433;database=CRUDTienda;" + "encrypt=true;trustServerCertificate=true", "Andy1", "12345");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}

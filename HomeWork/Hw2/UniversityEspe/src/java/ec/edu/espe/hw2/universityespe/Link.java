/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hw2.universityespe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
public class Link {
    private static final String db = "universityespe";
    private static final String URL = "jdbc:mysql://localhost:3306/" + db;
    private static final String USERNAME = "root";
    private static final String PASSSWORD = "patin97";

    public  Connection getLink() {
        Connection link = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(URL, USERNAME, PASSSWORD);
            System.out.println("Conexion realizada con exito");
        } catch (Exception e) {
            System.out.println("Conexion Fallida...");
        }
        return link;
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hw2.universityespe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patin
 */
public class Student {
    
    public int contRegister() 
    {
        Link link = new Link();
        Connection accessDB = link.getLink();
        Statement query = null;
        try {
            query = accessDB.createStatement();
        } catch (SQLException ex) {
            System.out.print(ex);
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet rs = null;
        try {
            rs = query.executeQuery("SELECT * FROM Student");
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        int total = 0;
        try {
            while (rs.next()){
                //Obtienes la data que necesitas...
                total++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
    
    public void registerStudent(int idCourse, String name, float deposit){
        Link link = new Link();
        Connection ln = link.getLink();
        int cont = contRegister();
        Statement st;
        String insertTableSQL = "INSERT INTO Student"
                + "(idStudent, idCourseStu, nameStudent, deposit) VALUES"
                + "('"+(cont + 1)+"','"+idCourse+"','"+name+"','"+deposit+"')";
         try {
            
            st = ln.createStatement();
            st.executeUpdate(insertTableSQL);
            st.close();
            ln.close();

        } catch (SQLException e) {

            System.out.println("error");

        } 
    }

}

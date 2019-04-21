/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hw2.universityespe;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Patin
 */
public class Course {
    private String course;
    private String Schedule;
    private float cost;
    private float balance;
    private String instructor;

    public Course(String course, String Schedule, float cost, float balance, String instructor) {
        this.course = course;
        this.Schedule = Schedule;
        this.cost = cost;
        this.balance = balance;
        this.instructor = instructor;
    }
    
    public Course(){
        
    }
    
    public Course viewCourse(int idCourse, float deposit){
        Link link = new Link();
        Connection ln = link.getLink();
        String query = "SELECT * FROM Course";
        Course course = new Course("", "", 0f, 0f, "");
        boolean flag = false;
        try{
        // create the java statement
        Statement st = ln.createStatement();
        // execute the query, and get a java resultset
        ResultSet rs = st.executeQuery(query);
        // iterate through the java resultset
        while (rs.next())
        {
            int id = rs.getInt("idCourse");
            String name = rs.getString("nameCourse");
            String schedule = rs.getString("scheduleCourse");
            float cost = rs.getFloat("costCourse");
            String instructor = rs.getString("instructor");
            float balance = cost - deposit;
            if(idCourse == id)
            {
                course = new Course(name, schedule, cost, balance, instructor);
                flag = true;
            }
            if(flag == true)
            {
                break;
            }

        }
        st.close();
      }
      catch (Exception e)
      {
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
          course = new Course("", "", 0f, 0f, "");
      }
        return course;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the Schedule
     */
    public String getSchedule() {
        return Schedule;
    }

    /**
     * @param Schedule the Schedule to set
     */
    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return the instructor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    
            
}

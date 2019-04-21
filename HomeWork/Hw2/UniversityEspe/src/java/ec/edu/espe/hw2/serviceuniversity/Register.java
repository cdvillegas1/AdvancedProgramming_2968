/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hw2.serviceuniversity;

import ec.edu.espe.hw2.universityespe.Course;
import ec.edu.espe.hw2.universityespe.Student;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Patin
 */
@Path("register")
public class Register {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Register
     */
    public Register() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.lab3.serviceuniversity.Register
     * @return an instance of ec.edu.espe.lab3.universityespe.Course
     */
    @Path("{idcourse}/{name}/{deposit}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Course getStudent(@PathParam("idcourse") String idCourse, @PathParam("name") String name, @PathParam("deposit") String deposit){
        int id = Integer.parseInt(idCourse);
        float deposits = Float.parseFloat(deposit);
        
        Student students = new Student();
        students.registerStudent(id, name, deposits);
        
        Course course = new Course();
        course = course.viewCourse(id, deposits);
        return course;
    }

    /**
     * PUT method for updating or creating an instance of Register
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putJson(Course content) {
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import Model.Student;
import Model.Teacher;
import java.util.List;
import org.hibernate.Session;

/**
 *
 *  @author ishimwe anna
 */
public class StudentDao {
     public Student RegisterStudent(Student accobj){
        try {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.save(accobj);
        session.beginTransaction().commit();
        session.close(); 
        return accobj;
            
        } catch (Exception e) {
        }
       
        return null;

    }
       public List<Student>retrivestudent(){
        
        try {
           Session session=HibernateUtil.getSessionFactory().openSession();
           List<Student> alldata=session.createQuery("select ep from Student ep").list();
            session.beginTransaction().commit();
            session.close();
            return alldata;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

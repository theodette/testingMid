/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import Model.CourseDefinition;
import org.hibernate.Session;

/**
 *
 *  @author ishimwe anna
 */
public class CourseDifinitionDao {
     public CourseDefinition RegisterCourseDifinition(CourseDefinition accobj){
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
}

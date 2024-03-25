/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ishimwe anna
 */
public class CourseDao {
 
    public Course RegisterCourse(Course accobj){
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
    public List<Course>retrivecourse(){
        
        try {
           Session session=HibernateUtil.getSessionFactory().openSession();
           List<Course> alldata=session.createQuery("select ep from Course ep").list();
            session.beginTransaction().commit();
            session.close();
            return alldata;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Course> departmentandSemester(Course courseobj) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Course> courseData = session.createQuery("Select ad  FROM Course ad where academicUnitsid =:accid AND semester_id=:semid")
        .setParameter("semid", courseobj.getSemesters())
        .setParameter("accid", courseobj.getAcademicUnits())
        .list();
        session.beginTransaction().commit();
        session.close();
        
        return courseData;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
        
        
}

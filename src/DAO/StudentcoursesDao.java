/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import Model.StudentCourse;
import Model.StudentRegistration;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ishimwe anna
 */
public class StudentcoursesDao {
    public StudentCourse RegisterStudentCourse(StudentCourse accobj){
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
    
    public List<StudentCourse>CourseperStudent(StudentCourse courseobj) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<StudentCourse> courseData = session.createQuery("Select ad FROM StudentCourse ad where Studentid=:stdid")
        .setParameter("stdid", courseobj.getStudentRegistration())
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

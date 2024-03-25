/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import Model.Student;
import Model.StudentRegistration;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ishimwe anna
 */
public class StudentRegistrationDao {
    public StudentRegistration RegisterStudentRegistration(StudentRegistration accobj){
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
    
    public List<StudentRegistration>StudentperSemester(StudentRegistration courseobj) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<StudentRegistration> StudentData = session.createQuery("Select ad FROM StudentRegistration ad where semester_id=:semid")
        .setParameter("semid", courseobj.getSemestersdata())
        .list();
        session.beginTransaction().commit();
        session.close();
        return StudentData;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
     public List<StudentRegistration>StudentperDepartmentandSemester(StudentRegistration courseobj) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<StudentRegistration> StudentData = session.createQuery("Select ad FROM StudentRegistration ad where semester_id=:semid AND AcademiccodeId=:academic ")
        .setParameter("semid", courseobj.getSemestersdata())
        .setParameter("academic", courseobj.getAccademicUnitdata())       
        .list();
        session.beginTransaction().commit();
        session.close();
        return StudentData;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    
    
}

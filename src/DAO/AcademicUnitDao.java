/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AcademicUnit;
import Model.EAcademicUnit;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ishimwe anna
 */
public class AcademicUnitDao {
    
    public AcademicUnit RegisterAccademicUnit(AcademicUnit accobj){
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
    
     public List<AcademicUnit> retrivefacultyandprograms(){
        try {
            Session session=HibernateUtil.getSessionFactory().openSession();
            List<AcademicUnit> accademic_data=session.createQuery("select ad from AcademicUnit ad where type= :data OR type= :data1")
                    .setParameter("data",EAcademicUnit.FACULTY)
                    .setParameter("data1", EAcademicUnit.PROGRAM)
                    .list();
            session.beginTransaction().commit();
            session.close();
            return accademic_data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
      public List<AcademicUnit> retrivedepartmenttype(){
        try {
            Session session=HibernateUtil.getSessionFactory().openSession();
            List<AcademicUnit> accademic_data=session.createQuery("select ad from AcademicUnit ad where type= :data")
                    .setParameter("data",EAcademicUnit.DEPARTMENT)
                    .list();
            session.beginTransaction().commit();
            session.close();
            return accademic_data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
}

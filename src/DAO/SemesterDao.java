/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Semester;
import java.util.List;
import org.hibernate.Session;

/**
 *
 *  @author ishimwe anna
 */
public class SemesterDao {
  
   
    public Semester  RegisterSemester(Semester  accobj){
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
    
     public List<Semester>reitriveSmester(){
        
        try {
           Session session=HibernateUtil.getSessionFactory().openSession();
           List<Semester> alldata=session.createQuery("select ep from Semester ep").list();
            session.beginTransaction().commit();
            session.close();
            return alldata;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

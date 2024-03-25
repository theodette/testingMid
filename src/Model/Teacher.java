/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 *  @author ishimwe anna
 */
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String fullname;
    private String Qualification;
    @ManyToOne
    @JoinColumn(name = "Course_Id")
    private Course Coursesd;

    public Teacher() {
    }

    public Teacher(Integer Id, String fullname, String Qualification, Course Coursesd) {
        this.Id = Id;
        this.fullname = fullname;
        this.Qualification = Qualification;
        this.Coursesd = Coursesd;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public Course getCoursesd() {
        return Coursesd;
    }

    public void setCoursesd(Course Coursesd) {
        this.Coursesd = Coursesd;
    }
    
    
    
    
}

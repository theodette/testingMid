/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author MANISHIMWE Eric
 */
@Entity
public class Semester {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer semester_id;
    private String name;
    private Date  Startdate;
    private Date endDate;
    
    @OneToMany(mappedBy = "semesters")
    private List<Course> courses = new ArrayList<>();
    
    @OneToMany(mappedBy = "semestersdata")
    private List<StudentRegistration> studentRegistrations = new ArrayList<>();
    
    @OneToMany(mappedBy = "semestersdata1")
    private List<StudentCourse> studentcourse = new ArrayList<>();

    public Semester() {
    }

    public Semester(Integer semester_id, String name, Date Startdate, Date endDate) {
        this.semester_id = semester_id;
        this.name = name;
        this.Startdate = Startdate;
        this.endDate = endDate;
    }

    public Integer getSemester_id() {
        return semester_id;
    }

    public void setSemester_id(Integer semester_id) {
        this.semester_id = semester_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartdate() {
        return Startdate;
    }

    public void setStartdate(Date Startdate) {
        this.Startdate = Startdate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<StudentRegistration> getStudentRegistrations() {
        return studentRegistrations;
    }

    public void setStudentRegistrations(List<StudentRegistration> studentRegistrations) {
        this.studentRegistrations = studentRegistrations;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    
    
}

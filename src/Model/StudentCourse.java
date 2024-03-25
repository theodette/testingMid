/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 @author ishimwe anna
 */
@Entity
public class StudentCourse {
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "Studentid")
    private Student studentRegistration;
    @ManyToOne
    @JoinColumn(name = "Courseid")
    private Course studentCourse;
    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semestersdata1;
    
    private Integer Cousecredit;
    @Column(nullable = true)
    private String result;

    public StudentCourse() {
    }

    public StudentCourse(Integer id, Student studentRegistration, Course studentCourse, Semester semestersdata1, Integer Cousecredit, String result) {
        this.id = id;
        this.studentRegistration = studentRegistration;
        this.studentCourse = studentCourse;
        this.semestersdata1 = semestersdata1;
        this.Cousecredit = Cousecredit;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudentRegistration() {
        return studentRegistration;
    }

    public void setStudentRegistration(Student studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

    public Course getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Course studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Semester getSemestersdata1() {
        return semestersdata1;
    }

    public void setSemestersdata1(Semester semestersdata1) {
        this.semestersdata1 = semestersdata1;
    }

    public Integer getCousecredit() {
        return Cousecredit;
    }

    public void setCousecredit(Integer Cousecredit) {
        this.Cousecredit = Cousecredit;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
    
    
}

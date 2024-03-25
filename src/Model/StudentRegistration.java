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
 * @author ishimwe anna
 */
@Entity
public class StudentRegistration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentid;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "AcademiccodeId")
    private AcademicUnit accademicUnitdata;
    
    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semestersdata;

    public StudentRegistration() {
    }

    public StudentRegistration(Integer studentid, Student student, AcademicUnit accademicUnitdata, Semester semestersdata) {
        this.studentid = studentid;
        this.student = student;
        this.accademicUnitdata = accademicUnitdata;
        this.semestersdata = semestersdata;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public AcademicUnit getAccademicUnitdata() {
        return accademicUnitdata;
    }

    public void setAccademicUnitdata(AcademicUnit accademicUnitdata) {
        this.accademicUnitdata = accademicUnitdata;
    }

    public Semester getSemestersdata() {
        return semestersdata;
    }

    public void setSemestersdata(Semester semestersdata) {
        this.semestersdata = semestersdata;
    }
    
    
    
}

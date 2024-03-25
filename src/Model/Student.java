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
 *  @author ishimwe anna
 */
@Entity
public class Student {
    @Id
    private String student_id;
    private String Fullname;
    private Date Dateofbirth;
    
    @OneToMany(mappedBy = "student")
    private List<StudentRegistration> studentRegistrations = new ArrayList<>();

    public Student() {
    }
    

    public Student(String student_id, String Fullname, Date Dateofbirth) {
        this.student_id = student_id;
        this.Fullname = Fullname;
        this.Dateofbirth = Dateofbirth;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public Date getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(Date Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }

    public List<StudentRegistration> getStudentRegistrations() {
        return studentRegistrations;
    }

    public void setStudentRegistrations(List<StudentRegistration> studentRegistrations) {
        this.studentRegistrations = studentRegistrations;
    }

    @Override
    public String toString() {
        return  student_id ;
    }
    
    
}

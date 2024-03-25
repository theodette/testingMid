/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ishimwe anna
 */
@Entity
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Academiccode;
    private String name;
    @Enumerated
    private EAcademicUnit type;
    @ManyToOne
    @JoinColumn(name = "Parent_Id", nullable = true)
    private AcademicUnit accademicUnit; 
    
    @OneToMany(mappedBy = "academicUnits")
    private List<Course>  courses= new ArrayList<>();
    
    @OneToMany(mappedBy = "accademicUnitdata")
    private List<StudentRegistration>  registrations = new ArrayList<>();

    public AcademicUnit() {
    }

    public AcademicUnit(Integer Id, String Academiccode, String name, EAcademicUnit type, AcademicUnit accademicUnit) {
        this.Id = Id;
        this.Academiccode = Academiccode;
        this.name = name;
        this.type = type;
        this.accademicUnit = accademicUnit;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getAcademiccode() {
        return Academiccode;
    }

    public void setAcademiccode(String Academiccode) {
        this.Academiccode = Academiccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EAcademicUnit getType() {
        return type;
    }

    public void setType(EAcademicUnit type) {
        this.type = type;
    }

    public AcademicUnit getAccademicUnit() {
        return accademicUnit;
    }

    public void setAccademicUnit(AcademicUnit accademicUnit) {
        this.accademicUnit = accademicUnit;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<StudentRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<StudentRegistration> registrations) {
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return name + " " + type ;
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 *  @author ishimwe anna
 */
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Coursecode;
    private  String name;
    private Integer coursecredits;
      
    @OneToOne(mappedBy = "courses")
    private CourseDefinition couseDefinition;
    
    @ManyToOne
    @JoinColumn(name = "academicUnitsid")
    private AcademicUnit academicUnits;
    
    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semesters;
    
      @OneToMany(mappedBy = "Coursesd")
    private List<Teacher>  teachers= new ArrayList<>();
    
    @OneToMany(mappedBy = "studentCourse")
    private List<StudentCourse> studentCourses = new ArrayList<>();

    public Course() {
    }

    public Course(Integer Id, String Coursecode, String name, Integer coursecredits, CourseDefinition couseDefinition, AcademicUnit academicUnits, Semester semesters) {
        this.Id = Id;
        this.Coursecode = Coursecode;
        this.name = name;
        this.coursecredits = coursecredits;
        this.couseDefinition = couseDefinition;
        this.academicUnits = academicUnits;
        this.semesters = semesters;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCoursecode() {
        return Coursecode;
    }

    public void setCoursecode(String Coursecode) {
        this.Coursecode = Coursecode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoursecredits() {
        return coursecredits;
    }

    public void setCoursecredits(Integer coursecredits) {
        this.coursecredits = coursecredits;
    }

    public CourseDefinition getCouseDefinition() {
        return couseDefinition;
    }

    public void setCouseDefinition(CourseDefinition couseDefinition) {
        this.couseDefinition = couseDefinition;
    }

    public AcademicUnit getAcademicUnits() {
        return academicUnits;
    }

    public void setAcademicUnits(AcademicUnit academicUnits) {
        this.academicUnits = academicUnits;
    }

    public Semester getSemesters() {
        return semesters;
    }

    public void setSemesters(Semester semesters) {
        this.semesters = semesters;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    @Override
    public String toString() {
        return Coursecode + " "+ name ;
    }
    
    
    
    
}

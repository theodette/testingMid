import DAO.StudentcoursesDao;
import Model.Student;
import Model.StudentCourse;
import Model.Semester;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CourseperStudentTest {

    @Test
    public void Student_Semester() {
        Semester semester = new Semester();
        semester.setSemester_id(1);

        Student student = new Student();
        student.setStudent_id("23350");

        StudentCourse course = new StudentCourse();
        course.setStudentRegistration(student);

        StudentcoursesDao dao = new StudentcoursesDao();
        List<StudentCourse> studentCourseList = dao.CourseperStudent(course);

        // Test if studentCourseList is not empty
        assertNotNull(studentCourseList);
        assertTrue(studentCourseList.size() > 0);

        // Print list of courses
        for (StudentCourse studentCourse : studentCourseList) {
            System.out.println("Course: " + studentCourse.getStudentCourse().getName()); // Assuming Course has a name attribute
        }
    }
}

import DAO.CourseDao;
import Model.AcademicUnit;
import Model.Course;
import Model.Semester;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class courseperdepartmentandsemesterTest {

    @Test
    public void Student_SemesterandDepartment() {
        Semester semester = new Semester();
        semester.setSemester_id(1);

        AcademicUnit academicUnit = new AcademicUnit();
        academicUnit.setId(1);

        Course course = new Course();
        course.setAcademicUnits(academicUnit);
        course.setSemesters(semester);

        CourseDao dao = new CourseDao();
        List<Course> courseList = dao.departmentandSemester(course);

        // Test if courseList is not empty
        assertNotNull(courseList);
        assertTrue(courseList.size() > 0);

        // Print list of courses
        for (Course c : courseList) {
            System.out.println("Course: " + c.getName() + ", Course Code: " + c.getCoursecode());
        }
    }
}

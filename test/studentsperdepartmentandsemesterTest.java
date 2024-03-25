import DAO.StudentRegistrationDao;
import Model.AcademicUnit;
import Model.Semester;
import Model.StudentRegistration;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ishimwe anna
 */
public class studentsperdepartmentandsemesterTest {

    @Test
    public void Student_SemesterandDepartment() {
        Semester semester = new Semester();
        semester.setSemester_id(1);

        AcademicUnit academicUnit = new AcademicUnit();
        academicUnit.setId(1);

        StudentRegistration registration = new StudentRegistration();
        registration.setSemestersdata(semester);
        registration.setAccademicUnitdata(academicUnit);

        StudentRegistrationDao dao = new StudentRegistrationDao();
        List<StudentRegistration> registrationsList = dao.StudentperDepartmentandSemester(registration);

        // Test if registrationsList is not empty
        assertNotNull(registrationsList);
        assertTrue(registrationsList.size() > 0);

        // Print students per semester
        System.out.println("Students per Semester:");
        for (StudentRegistration reg : registrationsList) {
            Semester regSemester = reg.getSemestersdata();
            System.out.println("Student: " + reg.getStudent().getFullname() + " Semester: " + regSemester.getName());
        }
    }
}

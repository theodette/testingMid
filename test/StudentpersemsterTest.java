import DAO.StudentRegistrationDao;
import Model.Semester;
import Model.StudentRegistration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StudentpersemsterTest {

    @Test
    public void Student_Semester() {
        Semester semester = new Semester();
        semester.setSemester_id(1);

        StudentRegistration registration = new StudentRegistration();
        registration.setSemestersdata(semester);

        StudentRegistrationDao dao = new StudentRegistrationDao();
        List<StudentRegistration> registrationsList = dao.StudentperSemester(registration);

        // Test if registrationsList is not empty
        assertNotNull(registrationsList);
        assertTrue(registrationsList.size() > 0);

        // Print list of students
        for (StudentRegistration studentRegistration : registrationsList) {
            System.out.println("Student ID: " + studentRegistration.getStudent().getStudent_id() +
                    ", Full Name: " + studentRegistration.getStudent().getFullname()); // Assuming Student has a getFullname() method
        }
    }
}

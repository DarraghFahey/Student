package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {
    StudentList studentList = new StudentList();

    @Test
    public void testAddStudent() {
        Student student = new Student();
        studentList.addStudent(student);
        assertEquals(1, studentList.studentArrayListSize());
    }
}

package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentListTest {
    StudentList studentList = new StudentList();

    @Test
    public void testAddStudent() {
        Student student = new Student();
        studentList.addStudent(student);
        assertEquals(1, studentList.studentArrayListSize());
    }

    @Test
    void testFindStudent() {
        Student student = new Student();
        Student student1 = new Student("James Clement", "G00456789@gmit.ie");
        Student student2 = new Student("Nick Mason","G00987321@gmit.ie");
        Student foundStudent;

        studentList.addStudent(student);
        studentList.addStudent(student2);
        studentList.addStudent(student1);

        assertEquals(3, studentList.studentArrayListSize());
        foundStudent = studentList.findStudent("James Clement");
        assertEquals("James Clement", foundStudent.getName());
        assertEquals("G00456789@gmit.ie", foundStudent.getEmail());
    }

    @Test
    void testFindStudentNotFound() {
        Student student = new Student();
        Student student1 = new Student("James Clement", "G00456789@gmit.ie");
        Student student2 = new Student("Nick Mason","G00987321@gmit.ie");

        studentList.addStudent(student);
        studentList.addStudent(student1);
        studentList.addStudent(student2);

        assertEquals(3, studentList.studentArrayListSize());

        Exception e = assertThrows(IllegalArgumentException.class, ()->{new StudentList().findStudent("Broden Kelly");});
        assertEquals("No Student found with name provided", e.getMessage());
    }
}

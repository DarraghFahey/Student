package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testDefaultStudent() {
        assertEquals("Darragh Fahey", student.getName());
        assertEquals("G00352047@gmit.ie", student.getEmail());
    }

    @Test
    public void testStudentWithValues() {
        student = new Student("Gerry Ryan", "G00123456@gmit.ie");
        assertEquals("Gerry Ryan", student.getName());
        assertEquals("G00123456@gmit.ie", student.getEmail());
    }

    @Test
    public void testStudentWithInvalidNameValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Student(null, "");});
        assertEquals("No Name entered", e.getMessage());
    }

    @Test
    public void testStudentWithInvalidEmailValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Student("", null);});
        assertEquals("No Email entered", e.getMessage());
    }
}

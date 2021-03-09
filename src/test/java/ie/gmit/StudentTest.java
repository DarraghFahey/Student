package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testDefaultStudent() {
        assertEquals("Darragh Fahey", student.getName());
        assertEquals("G00352047@gmit.ie", student.getEmail());
    }

    @Test
    void testStudentWithValues() {
        student = new Student("Gerry Ryan", "G00123456@gmit.ie");
        assertEquals("Gerry Ryan", student.getName());
        assertEquals("G00123456@gmit.ie", student.getEmail());
    }

    //"Name must be must longer than 5 characters"
    @Test
    void testStudentWithInvalidNameValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Student(null, "");});
        assertEquals("No Name entered", e.getMessage());
    }

    @Test
    void testStudentWithInvalidEmailValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Student("", null);});
        assertEquals("No Name entered", e.getMessage());
    }
}

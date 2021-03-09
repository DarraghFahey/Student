package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testStudent() {
        assertEquals("Darragh Fahey", student.getName());
        assertEquals("G00352047@gmit.ie", student.getEmail());
    }
}

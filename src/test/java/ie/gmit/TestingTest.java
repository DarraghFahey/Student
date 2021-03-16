package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTest {

    @Test
    void testAdd() {
        Testing calculator = new Testing();
        int result = calculator.add(10,50);
        assertEquals(60, result);
    }

    @Test
    void testSubtract() {
        Testing calculator = new Testing();
        int result = calculator.subtract(50,10);
        assertEquals(40, result);
    }

    @Test
    void testMultiply() {
        Testing calculator = new Testing();
        int result = calculator.multiply(5,10);
        assertEquals(50, result);
    }

    @Test
    void testDivide() {
        Testing calculator = new Testing();
        int result = calculator.divide(100,10);
        assertEquals(10, result);
    }
}

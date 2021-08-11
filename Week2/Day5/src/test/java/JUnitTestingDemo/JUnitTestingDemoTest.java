package JUnitTestingDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTestingDemoTest extends JUnitTestingDemo{

    @Test
    void maxElementInArray() {
        assertEquals(43 ,maxElementInArray(new int[]{10, 30, 43, 12, 34, 12, 31}));
    }

    @Test
    void cubeOfElement() {
        try {
            cubeOfElement(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void reverseStringWithEmptyString() {
        reverseString("");
    }

    @Test
    void reverseStringWithString() {
        try {
            reverseString("Hello");
        }  catch (InvalidStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
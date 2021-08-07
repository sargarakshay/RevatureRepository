package JUnitTestingDemo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class JUnitTestingDemoTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void maxElementInArray() {
        assertEquals(80, JUnitTestingDemo.maxElementInArray(new int[]{ 10, 20 ,30, 50, 80}));
    }

    @Test
    void cubeOfElement() {
        try {
            JUnitTestingDemo.cubeOfElement(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void reverseString() {
        try {
            JUnitTestingDemo.reverseString("Hello");
        } catch (InvalidStringException e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
    }
}
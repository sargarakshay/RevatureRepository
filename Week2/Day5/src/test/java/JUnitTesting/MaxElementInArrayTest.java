package JUnitTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxElementInArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMaxArrayElement() {
        assertEquals(60, MaxElementInArray.maxArrayElement(new int[]{10 ,20 ,30 , 40, 50, 60}));
    }

    @Test
    void testCubeOfGivenElement() {
        try {
            MaxElementInArray.cubeOfGivenElement(-20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
    }

}
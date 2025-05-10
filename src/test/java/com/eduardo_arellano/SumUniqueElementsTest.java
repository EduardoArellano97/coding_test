package com.eduardo_arellano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumUniqueElementsTest {
    private final SumUniqueElements sumUnique = new SumUniqueElements();

    @Test
    void testOnlyUniqueElements() {
        int[] input = {1, 2, 3, 4};
        assertEquals(10, sumUnique.sumUniqueElements(input));
    }

    @Test
    void testNoUniqueElements() {
        int[] input = {5, 5, 6, 6};
        assertEquals(0, sumUnique.sumUniqueElements(input));
    }

    @Test
    void testSomeUniqueElements() {
        int[] input = {1, 2, 2, 3, 4, 1};
        assertEquals(7, sumUnique.sumUniqueElements(input));
    }

    @Test
    void testNullInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> sumUnique.sumUniqueElements(null));
    }
}

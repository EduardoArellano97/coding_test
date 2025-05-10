package com.eduardo_arellano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void testFizzBuzzForMultiplesOfThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(15));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(30));
        assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(45));
    }
    @Test
    void testFizzBuzzForMultiplesOfFive() {
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(5));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(10));
        assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(20));
    }
    @Test
    void testFizzBuzzForMultiplesOfThree() {
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(3));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(6));
        assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(9));
    }

}

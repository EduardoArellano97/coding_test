package com.eduardo_arellano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome("Racecar"));
        assertTrue(palindrome.isPalindrome("Madam"));
        assertTrue(palindrome.isPalindrome("Never odd or even"));
        assertTrue(palindrome.isPalindrome("Taco Cat"));
    }
    @Test
    void testIsNotPalindrome() {
        assertFalse(palindrome.isPalindrome("Nebraska"));
        assertFalse(palindrome.isPalindrome("Not a palindrome"));
    }
    // Ensures that passing null throws an IllegalArgumentException
    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> palindrome.isPalindrome(null));
    }
}

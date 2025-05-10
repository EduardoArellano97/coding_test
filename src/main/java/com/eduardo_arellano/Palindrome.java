package com.eduardo_arellano;

/*
 * Instructions:
 * Write a function that checks if a given word is a palindrome.
 * A palindrome is a word that reads the same backward as forward (e.g., "radar", "level").
 * The function should ignore case and spaces.
 */

public class Palindrome
{
    /**
     * Determines whether a given word is a palindrome. Ignoring spaces and case sensitivity.
     *
     * @param word The input string to evaluate.
     * @return true if the word is a palindrome; false if not.
     * @throws IllegalArgumentException if the input word is null.
     */
    public boolean isPalindrome(String word) {
        if (word == null) {
            // Throw an exception if the input is null.
            throw new IllegalArgumentException("The word to evaluate must not be null");
        }

        // Normalize the input so it removes all whitespace and convert to lowercase, using regex.
        String normalizedWord = word.replaceAll("\\s+", "").toLowerCase();

        // Create a reversed version of the normalized word using StringBuilder.
        String reversed = new StringBuilder(normalizedWord)
                .reverse()
                .toString();

        // Return true if the normalized word matches its reversed version.
        return normalizedWord.equals(reversed);
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("ra dAr"));
        System.out.println(p.isPalindrome("Leve L"));
    }
}

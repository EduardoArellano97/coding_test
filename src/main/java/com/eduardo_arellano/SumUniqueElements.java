package com.eduardo_arellano;
import java.util.HashMap;
import java.util.Map;
/*
 * Instructions: Given a list of integers, write a function that returns the sum of all
 * unique elements (i.e., elements that appear only once in the list)
 */
public class SumUniqueElements {

    /**
     * Calculates the sum of all unique elements in the input array.
     *
     * @param numbers An array of integers.
     * @return The sum of all elements that appear exactly once.
     */
    public int sumUniqueElements(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        // Map to count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Sum only those elements whose frequency is exactly one
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumUniqueElements calculator = new SumUniqueElements();
        int result = calculator.sumUniqueElements(new int[]{1, 2, 3, 2, 4});
        System.out.println(result); //  8

    }
}
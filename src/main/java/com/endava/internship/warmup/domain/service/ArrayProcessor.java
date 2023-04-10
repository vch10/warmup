package com.endava.internship.warmup.domain.service;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public interface ArrayProcessor {
    /**
     * Return true if there are no numbers that divide by 10
     *
     * @param input non-null immutable array of ints
     */
    boolean noneMatch(int[] input);

    /**
     * Return true if at least one value in input matches the predicate
     *
     * @param input non-null immutable array of ints
     * @param predicate invoke the predicate.test(int value) on each input element
     */
    boolean someMatch(int[] input, IntPredicate predicate);

    /**
     * Return true if all values processed by function, matches the predicate
     *
     * @param input non-null immutable array of Strings. No element is null
     * @param function invoke function.applyAsInt(String value) to transform all the input elements into an int value
     * @param predicate invoke predicate.test(int value) to test the int value obtained from the function
     */
    boolean allMatch(String[] input,
                     ToIntFunction<String> function,
                     IntPredicate predicate);

    /**
     * Copy values into a separate array from specific index to stopindex
     *
     * @param input non-null array of ints
     * @param startInclusive the first index of the element from input to be included in the new array
     * @param endExclusive the last index prior to which the elements are to be included in the new array
     * @throws IllegalArgumentException when parameters are outside of input index bounds
     */
    int[] copyValues(int[] input, int startInclusive, int endExclusive) throws IllegalArgumentException;

    /**
     * Replace even index values with their doubles and odd indexed elements with their negative
     *
     * @param input non-null immutable array of ints
     * @return new array with changed elements
     */
    int[] replace(int[] input);

    /**
     * Find the second max value in the array
     *
     * @param input non-null immutable array of ints
     */
    int findSecondMax(int[] input);

    /**
     * Return in reverse first negative numbers, then positive numbers from array
     *
     * @param input non-null immutable array of ints.
     * @return example:
     *          input {3, -5, 4, -7, 2 , 9}
     *          result: {-7, -5, 9, 2, 4, 3}
     */
    int[] rearrange(int[] input);

    /**
     * Remove (filter) all values which are smaller than (input max element - 10)
     *
     * @param input non-null immutable array of ints
     * @return The result array should not contain empty cells!
     */
    int[] filter(int[] input);

    /**
     * Insert values into input array at a specific index.
     *
     * @param input non-null immutable array of ints.
     * @param startInclusive the index of input at which the first element from values array should be inserted
     * @param values the values to be inserted from startInclusive index
     * @return new array containing the combined elements of input and values
     * @throws IllegalArgumentException when startInclusive is out of bounds for input
     */
    int[] insertValues(int[] input, int startInclusive, int[] values) throws IllegalArgumentException;

    /**
     * Merge two sorted input and input2 arrays so that the return values are also sorted
     *
     * @param input first non-null array
     * @param input2 second non-null array
     * @return new array containing all elements sorted from input and input2
     * @throws IllegalArgumentException if either input or input are not sorted ascending
     */
    int[] mergeSortedArrays(int[] input, int[] input2) throws IllegalArgumentException;

    /**
     * In order to execute a matrix multiplication, in this method, please validate the input data throwing exceptions for invalid input.
     * If the the input params are satisfactory, do not throw any exception.
     *
     * Please review the matrix multiplication https://www.mathsisfun.com/algebra/matrix-multiplying.html
     *
     * @param leftMatrix the left matrix represented by array indexes [row][column]
     * @param rightMatrix the right matrix represented by array indexes [row][column]
     * @throws NullPointerException when any of the inputs are null. (arrays, rows and columns)
     * @throws IllegalArgumentException when any array dimensions are not appropriate for matrix multiplication
     */
    void validateForMatrixMultiplication(int[][] leftMatrix, int[][] rightMatrix) throws NullPointerException, IllegalArgumentException;

    /**
     * Perform the matrix multiplication as described in previous example
     * Please review the matrix multiplication https://www.mathsisfun.com/algebra/matrix-multiplying.html
     *
     * @param leftMatrix the left matrix represented by array indexes [row][column]
     * @param rightMatrix the right matrix represented by array indexes [row][column]
     * @throws NullPointerException when any of the inputs are null. (arrays, rows and columns)
     * @throws IllegalArgumentException when any array dimensions are not appropriate for matrix multiplication
     */
    int[][] matrixMultiplication(int[][] leftMatrix, int[][] rightMatrix) throws NullPointerException, IllegalArgumentException;

    /**
     * Return only distinct values in an array.
     *
     * @param input non-null immutable array of ints.
     */
    int[] distinct(int[] input);
}

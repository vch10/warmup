package com.endava.internship.warmup.domain.service;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class ArrayProcessorWithForLoops implements ArrayProcessor {

    /**
     * Return true if there are no numbers that divide by 10
     * @param input non-null immutable array of ints
     */
    @Override
    public boolean noneMatch(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Return true if at least one value in input matches the predicate
     * @param input non-null immutable array of ints
     * @param predicate invoke the predicate.test(int value) on each input element
     */
    @Override
    public boolean someMatch(final int[] input, IntPredicate predicate) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Return true if all values processed by function, matches the predicate
     * @param input non-null immutable array of Strings. No element is null
     * @param function invoke function.applyAsInt(String value) to transform all the input elements into an int value
     * @param predicate invoke predicate.test(int value) to test the int value obtained from the function
     */
    @Override
    public boolean allMatch(final String[] input,
                            ToIntFunction<String> function,
                            IntPredicate predicate) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Copy values into a separate array from specific index to stopindex
     * @param input non-null array of ints
     * @param startInclusive the first index of the element from input to be included in the new array
     * @param endExclusive the last index prior to which the elements are to be included in the new array
     * @throws IllegalArgumentException when parameters are outside of input index bounds
     */
    @Override
    public int[] copyValues(int[] input, int startInclusive, int endExclusive) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Replace even index values with their doubles and odd indexed elements with their negative
     * @param input non-null immutable array of ints
     * @return new array with changed elements
     */
    @Override
    public int[] replace(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Find the second max value in the array
     * @param input non-null immutable array of ints
     */
    @Override
    public int findSecondMax(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Return in reverse first negative numbers, then positive numbers from array
     * @param input non-null immutable array of ints.
     * @return example: input {3, -5, 4, -7, 2 , 9}
     *                  result: {-7, -5, 9, 2, 4, 3}
     */
    @Override
    public int[] rearrange(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Remove (filter) all values which are smaller than (input max element - 10)
     * @param input non-null immutable array of ints
     * @return The result array should not contain empty cells!
     */
    @Override
    public int[] filter(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Insert values into input array at a specific index.
     * @param input non-null immutable array of ints.
     * @param startInclusive the index of input at which the first element from values array should be inserted
     * @param values the values to be inserted from startInclusive index
     * @return new array containing the combined elements of input and values
     * @throws IllegalArgumentException when startInclusive is out of bounds for input
     */
    @Override
    public int[] insertValues(final int[] input, int startInclusive, int[] values) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Merge two sorted input and input2 arrays so that the return values are also sorted
     * @param input first non-null array
     * @param input2 second non-null array
     * @return new array containing all elements sorted from input and input2
     * @throws IllegalArgumentException if either input or input are not sorted ascending
     */
    @Override
    public int[] mergeSortedArrays(int[] input, int[] input2) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * In order to execute a matrix multiplication, in this method, please validate the input data throwing exceptions for invalid input. If the the
     * input params are satisfactory, do not throw any exception.
     *
     * Please review the matrix multiplication https://www.mathsisfun.com/algebra/matrix-multiplying.html
     * @param leftMatrix the left matrix represented by array indexes [row][column]
     * @param rightMatrix the right matrix represented by array indexes [row][column]
     * @throws NullPointerException when any of the inputs are null. (arrays, rows and columns)
     * @throws IllegalArgumentException when any array dimensions are not appropriate for matrix multiplication
     */
    @Override
    public void validateForMatrixMultiplication(int[][] leftMatrix, int[][] rightMatrix) throws NullPointerException, IllegalArgumentException {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Perform the matrix multiplication as described in previous example Please review the matrix multiplication
     * https://www.mathsisfun.com/algebra/matrix-multiplying.html
     * @param leftMatrix the left matrix represented by array indexes [row][column]
     * @param rightMatrix the right matrix represented by array indexes [row][column]
     * @throws NullPointerException when any of the inputs are null. (arrays, rows and columns)
     * @throws IllegalArgumentException when any array dimensions are not appropriate for matrix multiplication
     */
    @Override
    public int[][] matrixMultiplication(final int[][] leftMatrix, final int[][] rightMatrix) throws NullPointerException, IllegalArgumentException {
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Return only distinct values in an array.
     * @param input non-null immutable array of ints.
     */
    @Override
    public int[] distinct(final int[] input) {
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}

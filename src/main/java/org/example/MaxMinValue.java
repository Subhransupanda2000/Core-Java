package org.example;

class maxminvalue
{
    public static void main(String[] args) {
        int[] array = {7, 2, 9, 1, 5, 3};
        int min = array[0];  // Assume the first element as the minimum
        int max = array[0];  // Assume the first element as the maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Update minimum if a smaller value is found
            }
            if (array[i] > max) {
                max = array[i];  // Update maximum if a larger value is found
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}



package org.example;

public class ReverseArray {
            public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5};
                reverseArray(array);

                // Print the reversed array
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }

            public static void reverseArray(int[] array) {
                int start = 0;
                int end = array.length - 1;

                while (start < end) {
                    // Swap elements at start and end positions
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;

                    // Move start towards the end
                    start++;

                    // Move end towards the start
                    end--;
                }
            }
        }











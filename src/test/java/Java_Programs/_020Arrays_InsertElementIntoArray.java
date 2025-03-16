package Java_Programs;

import java.util.Arrays;

public class _020Arrays_InsertElementIntoArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int newElement = 4;

        // Create a new array with a larger size
        int[] newArray = new int[originalArray.length + 1];

        // Copy the elements of the original array into the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Add the new element at the end of the new array
        newArray[originalArray.length] = newElement;

        // Print the new array
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}

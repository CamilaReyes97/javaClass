import java.util.Arrays;

public class ArrayImp {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Copy of the original array with a new length of 10
        int[] extendedArray = Arrays.copyOf(originalArray, 10);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Extended Array: " + Arrays.toString(extendedArray));

        // Copy of the original array with a new length of 3
        int[] truncatedArray = Arrays.copyOf(originalArray, 3);

        System.out.println("Truncated Array: " + Arrays.toString(truncatedArray));
    }
}

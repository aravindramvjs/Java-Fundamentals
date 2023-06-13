package day09.practice;

public class ArrayReversal {

	public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the indices
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {12, 323, 23, 54};

        System.out.println("Original Array:");
        printArray(array);

        reverseArray(array);

        System.out.println("\nReversed Array:");
        printArray(array);
    }
}


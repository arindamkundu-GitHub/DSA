package ARRAY;

public class SumArray {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Predefined array (Test Case 1)
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate and print the sum
        int result = calculateSum(arr);
        System.out.println(result); // Expected Output: 15
    }
}

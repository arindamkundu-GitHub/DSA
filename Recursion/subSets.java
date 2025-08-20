package Recursion;
import java.util.*;

public class subSets {
    static void helper(int i, int[] nums, int[] subset, int size) {
        if (i == nums.length) {
            if (size > 0) {  
                for (int j = 0; j < size; j++) {
                    System.out.print(subset[j] + " ");
                }
                System.out.println();
            }
            return;
        }
        subset[size] = nums[i];
        helper(i + 1, nums, subset, size + 1);
        helper(i + 1, nums, subset, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int[] subset = new int[n];  
        helper(0, nums, subset, 0);
    }
}



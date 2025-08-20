package ARRAY;
public class nextGreatestElement {
    public static void main(String[] args) {
   int[] arr = {6, 5, 4, 9, 2, 1};
int n = arr.length;

int[] ans = new int[n];
ans[n - 1] = arr[n - 1]; // last element remains the same

int maxFromRight = arr[n - 1];

for (int i = n - 2; i >= 0; i--) {
    maxFromRight = Math.max(maxFromRight, arr[i]);
    ans[i] = maxFromRight;
}

// Print result
for (int num : ans) {
    System.out.print(num + " ");
}


    }
}

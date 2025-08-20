import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args) {
        //int [] arr={20,25,67,67,89,91,95};
        Scanner sc=new Scanner(System.in);
       // System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        //System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // // Input the target
        // System.out.print("Enter target: ");
        int target = sc.nextInt();

        int lb=n;
        int lo=0,hi=n-1;
        //int target=67;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=target) {
                 lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}

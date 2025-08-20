import java.util.Scanner;

public class decreasingOrder {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         for(int x=1;x<=n-1;x++){
            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}

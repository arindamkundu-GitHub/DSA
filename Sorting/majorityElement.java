public class majorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int n= arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }
            }
        }
        System.out.println(arr[n / 2]);

    }
}

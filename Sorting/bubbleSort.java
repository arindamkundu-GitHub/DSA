public class bubbleSort {
    public static void main(String[] args) {
         int[] arr={5,7,1,9,3,6,2,8};
        int n=arr.length;
        for(int x=1;x<=n-1;x++){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
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

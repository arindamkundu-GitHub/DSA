public class mountainArrays {
    public static void main(String[] args) {
        int[] arr={0,1,0};
        int result=peak(arr);
        System.out.println(result);
    }
    public static int peak(int[] arr) {
        int n=arr.length;
        int lo=1,hi=n-2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
            else hi=mid-1;
        }
        return 1;

    }
}

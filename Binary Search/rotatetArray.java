public class rotatetArray {
    public static void main(String[] args) {
         int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int result=index(arr,target);
        System.out.println(result);
    }
    public static int index(int[] arr,int target){
        int n=arr.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<=arr[hi]){
                if(arr[mid]<target && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
            else{
                if(target>=arr[lo] && arr[mid]>target) hi=mid-1;
                else lo=mid+1;
            }
        }
        return -1;
    }
}

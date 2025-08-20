package Quick_Sort;

public class randomMizedQuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr,int lo,int hi){
        int mid=(lo+hi)/2;
        int pivot=arr[mid],pivotIdx=mid;
        int smallerCount=0;
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx=lo+smallerCount;
        swap(arr,pivotIdx,correctIdx);
        //partition

        int i=0,j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        int Idx= partition(arr,lo,hi);
        quicksort(arr,0,Idx-1);
        quicksort(arr,Idx+1,hi);
    }
    public static void main(String[] args) {
         int[] arr={4,87,3,56,34,79,5,50};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}

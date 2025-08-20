package ARRAY;

public class reverseArray {
    public static void main(String[] args) {
         int[] arr={10,20,30,40};
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int ele: arr){
            System.out.println(ele+" ");
        }
    }
}

package ARRAY;

public class mergeSort {
    public static void main(String[] args) {
        
     int [] a={0,1,2,4,5};
        int [] b={3,6};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
            c[k]=a[i];
            i++;
        }
        else {
            c[k]=b[j];
            j++;
            }
        k++;
        }
        if(i==m){
            while(j<n){
                c[k]=b[j];
                j++;k++;
            }
        }
        if(i==n){
            while(i<m){
                c[k]=a[i];
                i++;k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
}
}


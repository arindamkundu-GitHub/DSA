package Merge_Sort;

import java.util.Scanner;

public class mergeSortOrginal {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merged(int[] a,int[] b,int[] c){
        int m=a.length;
        int n=b.length;
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
        if(j==n){
            while(i<m){
                c[k]=a[i];
                i++;k++;
            }
        }
    }
    public static void merge(int[] arr){
        int x=arr.length;
        if(x==1) return;
        int[] a=new int[x/2];
        int[] b=new int[x-x/2];
        for(int i=0;i<x/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<x-x/2;i++){
            b[i]=arr[i+x/2];
        }
        merge(a);
        merge(b);

        merged(a, b, arr);

    }
    public static void main(String[] args) {
        //int[] arr={45,7,82,54,12,86,40,20};
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        merge(arr);
        print(arr);
    }
}

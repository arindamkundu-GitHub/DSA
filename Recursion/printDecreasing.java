package Recursion;

import java.util.Scanner;

public class printDecreasing {
     public static int print(int x,int n){
        if(x>n) return -1;
        System.out.println(x);
        return print(x+1,n);

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n);
    }
}

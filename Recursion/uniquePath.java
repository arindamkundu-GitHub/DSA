package Recursion;
import java.util.*;
public class uniquePath {
     public static int maze(int m,int n){
        if(m==1||n==1) return 1;
        int rightWays=maze(m,n-1);
        int downWays=maze(m-1,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(maze(m,n));
    }
}

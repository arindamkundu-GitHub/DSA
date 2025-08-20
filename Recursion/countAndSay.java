package Recursion;

import java.util.Scanner;

public class countAndSay {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String s=sc.nextLine();
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len=j-i;
        ans+=len;
        ans+=s.charAt(i);
       System.out.println(ans);
    }
}

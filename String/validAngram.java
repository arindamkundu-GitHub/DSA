package String;

import java.util.Arrays;

public class validAngram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean isanagram=validisanagram(s, t);
        System.out.println(isanagram);
    }
    public static boolean validisanagram(String s,String t) {
        
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}

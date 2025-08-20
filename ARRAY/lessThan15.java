package ARRAY;

import java.util.Scanner;

public class lessThan15 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Input the number of students
        int n = scanner.nextInt();
        int[] marks = new int[n];

        // Input the marks
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]<15){
                 System.out.println(i);
            }
        }
    }
}

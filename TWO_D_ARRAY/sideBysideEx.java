package TWO_D_ARRAY;

public class sideBysideEx {
    public static void main(String[] args) {
        // Number of students
        // int n = 3;
        // int m=2;

        // 2D array to store roll numbers and marks
        int[][] data = {
            {101, 85},
            {102, 90},
            {103, 78}
        };

        // Print roll number and marks
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                 System.out.print(data[i][j] + " "  );
                }
            System.out.println();
        }
    }
}



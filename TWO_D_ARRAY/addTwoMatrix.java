package TWO_D_ARRAY;
import java.util.Scanner;

public class addTwoMatrix {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
      
    //     int[][] arr=new int[2][2];
    //     for(int i=0;i<2;i++){
    //         for (int j = 0; j < 2; j++) {
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }

       
    //     int[][] brr=new int[2][2];
    //     for(int i=0;i<2;i++){
    //         for (int j = 0; j < 2; j++) {
    //             brr[i][j]=sc.nextInt();
    //         }
    //     }


    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<brr[0].length;j++){
    //             int sum=arr[i][j]+brr[i][j];
    //             System.out.print(sum+" ");
    //     }
    //      System.out.println();
    // }

    Scanner scanner = new Scanner(System.in);

int rows = scanner.nextInt();

int cols = scanner.nextInt();

int[][] matrix1 = new int[rows] [cols];

int[][] matrix2 = new int[rows] [cols];

int [][] result = new int[rows] [cols];

for (int i = 0 ;i < rows; i++) {

for (int j = 0 ; j < cols; j++) {

matrix1[i][j] = scanner.nextInt();

 }

}

for ( int i = 0; i < rows; i++) {

for (int j = 0;j < cols; j++) {

matrix2[i][j] = scanner.nextInt();
}
}

// for (i = 0 ;i < rows; i++) {

// for (int j = 0; j < cols; j++) {

// matrix2[i][j] = scanner.nextInt();

// }
// }

for (int i = 0; i < rows; i++) {

for (int j = 0; j < cols; j++) {

result[i][j] = matrix1[i][j] + matrix2[i][j];

}
}

for (int i = 0; i < rows; i++) {

for (int j = 0; j < cols; j++) {

System.out.print(result[i][j] + " ");

}

System.out.println();

}
scanner.close();


    }
}
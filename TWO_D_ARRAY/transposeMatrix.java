package TWO_D_ARRAY;
public class transposeMatrix {
    public static void main(String[] args) {
       //int [][] arr=new int[2][3];
        int[][] arr={{1,2,3},{4,5,6}};
        int [][] transpose=new int[3][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                transpose[j][i]=arr[i][j];
               // System.out.print(transpose+" ");
            }
          // System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


        //     int[][] arr={{1,2,3},{4,5,6}};
        // int [][] transpose=new int[2][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //         transpose[j][i]=arr[i][j];
        //        // System.out.print(transpose+" ");
        //     }
        // }
        //    // System.out.println();
        //    for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(transpose[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}

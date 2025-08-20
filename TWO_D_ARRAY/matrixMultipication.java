package TWO_D_ARRAY;
public class matrixMultipication {
     public static void print(int[][] arr){
            int m= arr.length, n= arr[0].length;
            for (int i=0; i < m; i++) {
                for (int j=0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                    System.out.println();

            }
            System.out.println();
        }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{7,8},{9,10},{11,12}};
        if(a[0].length!=b.length){
            System.out.println("Multiplication not Possible");
        }
        else{ // Multiplication is possible
            int[][] c = new int[a.length][b[0].length];
            for(int i=0;i<c.length;i++) {
                 for(int j=0;j<c[0].length;j++){ 
                    for(int k=0;k<b.length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            print(c);
        }
    }
}

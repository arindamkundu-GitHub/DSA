package TWO_D_ARRAY;
public class setTwoMatrix {
    public static void main(String[] args) {
        // write your code logic here
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int m=arr.length,n=arr[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        //marking the row and cols.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
            //set the 'true' rows to 0
        for(int i=0;i<m;i++){
            if(row[i]==true){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
            //set the 'true' cols to 0

         for(int j=0;j<n;j++){
            if(col[j]==true){
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    


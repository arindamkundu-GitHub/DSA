package TWO_D_ARRAY;

public class flipMatrix {
    public static void main(String[] args) {
        int[][] arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
         int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){ // flip the rows
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<n;j++){
            int noOfZeroes=0,noOfOnes=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }
            if(noOfZeroes>noOfOnes){   //flip that column
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        // Binary addition
       int score = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = (rowValue << 1) | arr[i][j];
            }
            score += rowValue;
        }
         System.out.println(score);
    }
}

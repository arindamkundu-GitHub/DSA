public class specialPattern {
    public static void main(String[] args) {
        int n=4;
        int total = (n * (n + 1)) / 2; // total sum
        int start = total;

        for (int i = n; i >=1; i--) {
            int num = start - (i - 1);
            for (int j = 0; j < i; j++) {
                System.out.print((num + j) + " ");
            }
            start -= i;
            System.out.println();
        }


        //   int n=4;
        // for(int i=1;i<=n;i++){
        //     int num=(i-1)*2;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

    }
}

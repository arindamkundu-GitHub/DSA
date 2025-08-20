public class patternprint2 {
    public static void main(String[] args) {
        int n=5;
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        //HOMEWORK 2


        for (int i = n; i>=1; i--) {
            if ((n - i) % 2 == 0) {
                for (int j = 0; j <i; j++) {
                    System.out.print((char)('A' + j) + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            }

        

    }
}

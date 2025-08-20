public class transform {
    public static void main(String[] args) {
         int[] arr={10,40,20,30,50};
        int n=arr.length;
        int x=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    mindx=j;
                }
            }
            arr[mindx]=x;
            x--;
        }
        for(int i=0;i<n;i++){
            arr[i]*=(-1);
        }
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }
}

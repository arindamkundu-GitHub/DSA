package ARRAY;
import java.util.ArrayList;
class targetArrayListUse {
      public static int findTargetIndex(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
               return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        // write your code logic here
        //int n = 5;
        int[] inputArray = {1, 2, 3, 4, 5};
        int target = 3;

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : inputArray) {
            list.add(num);
        }

        int result = findTargetIndex(list, target);
        System.out.println(result);


    }
}

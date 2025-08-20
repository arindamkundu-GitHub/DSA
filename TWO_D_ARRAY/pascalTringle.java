package TWO_D_ARRAY;

import java.util.ArrayList;
import java.util.List;

public class pascalTringle{
    public static void main(String[] args) {
         int n = 5;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    l.add(1);
                else
                    l.add(ans.get(i - 1).get(j-1) + ans.get(i - 1).get(j));
            }
            ans.add(l);
        }

        for (List<Integer> l : ans) {
            for (int num : l) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
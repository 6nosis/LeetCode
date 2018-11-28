package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            rowList.add(0, 1);
            for (int j = 1; j < i - 1; j++) {
                // set 而不是 add 可以重复写
                rowList.set(j, (rowList.get(j) + rowList.get(j + 1)));
            }
            list.add(new ArrayList<>(rowList));
        }
        return list;
    }

    public static void main(String[] args) {
        Solution118 solve = new Solution118();
        System.out.println(solve.generate(15));
    }
}

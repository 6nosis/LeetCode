package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            row.add(0,1);
            for (int j = 1; j < i - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            list.add(new ArrayList<>(row));
        }
        return list;
    }

    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1).get(rowIndex);
    }

    public static void main(String[] args) {
        Solution119 s = new Solution119();
        System.out.println(s.getRow(3));
    }
}

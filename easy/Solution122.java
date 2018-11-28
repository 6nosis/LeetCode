package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution122 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        List<Integer> max = new ArrayList<>();
        int min = prices[0], tmp;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                tmp = prices[i] - min;
                if (tmp > 0) {
                    max.add(tmp);
                }
                min = prices[i];
            }
        }
        int result = 0;
        for (int i = 0; i < max.size(); i++) {
            result += max.get(i);
        }
        return result;
    }

    public int maxProfit2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0;
        int max = 0;
        while (i < nums.length) {
            //找到附近最小的数
            while (i < nums.length - 1 && nums[i + 1] <= nums[i])
                i++;
            int min = nums[i];
            //找到附近最大的数
            while (i < nums.length - 1 && nums[i + 1] >= nums[i])
                i++;
            max += (i < nums.length) ? (nums[i++] - min) : 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution122 s = new Solution122();
        System.out.println(s.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }
}

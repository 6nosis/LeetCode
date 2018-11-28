package easy;

public class Solution121 {
    // 优化：找出波峰和波谷
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int tmpResult = prices[j] - prices[i];
                if (tmpResult > 0 && tmpResult > result) {
                    result = tmpResult;
                }
            }
        }
        return result;
    }

    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else {
                if (max < prices[i] - min)
                    max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution121 s = new Solution121();
        System.out.println(s.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }
}

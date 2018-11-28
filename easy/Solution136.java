package easy;

public class Solution136 {
    // 找不同标准操作，一个数组内有1个不同结果就是那个数
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

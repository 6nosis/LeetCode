package easy;

public class Solution198 {
    // dp
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(result[i-1], result[i-2] + nums[i]);
        }
        return result[result.length - 1];
    }

    //改迭代
    public int rob2(int[] nums) {
        int rob = 0, notRob = 0, n = nums.length;
        for(int i = 0; i < n; ++i){
            int preRob = rob, preNotRob = notRob;
            rob = preNotRob + nums[i];
            notRob = Math.max(preRob, preNotRob);
        }
        return Math.max(rob, notRob);
    }

    public static void main(String[] args) {
        Solution198 s = new Solution198();
        System.out.println(s.rob(new int[] {2,1,1,2}));
    }
}

package easy;

public class Solution35 {
    // TODO 二分搜索可优化
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else {
                if (target < nums[i]) {
                    return 0;
                }
                if (i == nums.length - 1){
                    return nums.length;
                }
                if (target > nums[i] && target < nums[i + 1]){
                    return i + 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution35 solve = new Solution35();
        System.out.println(solve.searchInsert(new int[] {1}, 0));
    }
}

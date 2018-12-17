package medium;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] == nums[i]) {
                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

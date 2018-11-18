package easy;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[length]) {
                length++;
                nums[length] = nums[i];
            }
        }
        return length + 1;
    }
    public static void main(String[] args) {
        Solution26 solve = new Solution26();
        System.out.println(solve.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}

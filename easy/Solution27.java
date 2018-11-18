package easy;

public class Solution27 {
    // 两个索引同时前进，当所在值和指定值不同时，index索引才前进
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Solution27 solve = new Solution27();
        System.out.println(solve.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }
}

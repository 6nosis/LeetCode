package easy;
// 求众数
public class Solution169 {
    // 分治法
    private int deviseMajorityElement(int[] nums, int begin, int end) {
        if (begin == end) {
            return nums[begin];
        } else {
            int mid = (begin + end) / 2;
            int left = deviseMajorityElement(nums, begin, mid);
            int right = deviseMajorityElement(nums, mid + 1, end);
            if (left == right) {
                return left;
            } else { // 求哪边大
                int cLeft = 0, cRight = 0;
                for (int i :
                        nums) {
                    if (left == i) {
                        cLeft++;
                    }
                    if (right == i) {
                        cRight++;
                    }
                }
                return cLeft > cRight ? left : right;
            }
        }
    }

    public int majorityElement(int[] nums) {
        return deviseMajorityElement(nums, 0, nums.length - 1);
    }
    // 优秀解
    public int majorityElement2(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int soldier = nums[0];
        int num = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == soldier){
                num++;
            }else{
                if(num == 0){
                    soldier = nums[i];
                    num = 1;
                }
                num--;
            }
        }
        return soldier;
    }

    public static void main(String[] args) {
        Solution169 s = new Solution169();
        System.out.println(s.majorityElement(new int[]{2, 3, 2, 5, 5, 5, 5, 5, 3, 3, 3}));
    }
}

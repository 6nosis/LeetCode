package easy;

public class 旋转数组189 {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    //优秀解
    public void rotate2(int[] nums, int k) {
        int[] tmp = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(tmp, 0, nums, 0, nums.length);
    }

    public void rotate3(int[] nums, int k) {
        int step = k % nums.length;
        int[] temp = nums.clone();
        for(int i = 0; i < nums.length; i++){
            nums[(i + step) % nums.length] = temp[i];
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || (k %= nums.length) == 0) {
            return;
        }
        int length = nums.length;
        int start = 0;
        int i = 0;
        int cur = nums[i];
        int cnt = 0;

        while (cnt++ < length) {
            i = (i + k) % length;
            int t = nums[i];
            nums[i] = cur;
            if (i == start) {
                ++start;
                ++i;
                cur = nums[i];
            } else {
                cur = t;
            }
        }
    }

    public static void main(String[] args) {
        旋转数组189 s = new 旋转数组189();
        int[] nums = new int[]{1, 2, 4, 5, 3, 7};
        int k = 3;
        s.rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 三数和 {
    //
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0)
                break;
            int sum = 0 - nums[k];
            int i = k + 1;
            int j = nums.length - 1;
            if (k >= 1 && nums[k] == nums[k - 1]) continue;
            while (i < j) {
                if ((nums[i] + nums[j]) == sum) {
                    List<Integer> tmp = new LinkedList<>();
                    tmp.add(nums[k]);
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    result.add(tmp);
                    while ((i < j) && (nums[i] == nums[i + 1])) i++;
                    while ((i < j) && (nums[j] == nums[j - 1])) j--;
                    i++;
                    j--;
                } else if ((nums[i] + nums[j]) > sum) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        三数和 s = new 三数和();
        System.out.println(s.threeSum(new int[] {3,0,-2,-1,1,2}));
    }
}

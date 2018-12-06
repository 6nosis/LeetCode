package easy;

public class Solution167 {
    // 暴力解法，，因为懒一下
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ( target - numbers[i] == numbers[j]) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[] {};
    }
    // 优化解法
    public int[] twoSum2(int[] numbers, int target) {
        // 头尾双指针，～～二分搜索～～ 不对，应该是夹逼？因为是排序后数组
        int p1 = 0, p2 = numbers.length - 1;
        int[] result = new int[2];
        while(p1 < p2){
            while(numbers[p1] + numbers[p2] > target) p2--;
            if(numbers[p1] + numbers[p2] == target){
                result[0] = p1 + 1;
                result[1] = p2 + 1;
                return result;
            }
            while(numbers[p1] + numbers[p2] < target) p1++;
        }
        return result;
    }
}

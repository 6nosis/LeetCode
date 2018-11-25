package easy;

import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return new int[] {1};
        if (digits.length == 1) {
            digits[digits.length - 1]++;
            if (digits[digits.length - 1] == 10) {
                return new int[] {1, 0};
            }
            return digits;
        } else {
            digits[digits.length - 1]++;
            if (digits[digits.length - 1] == 10) {
                digits =  plusOne(Arrays.copyOfRange(digits, 0, digits.length - 1));
                int [] temp = Arrays.copyOf(digits, digits.length + 1);
                temp[temp.length - 1] = 0;
                digits = Arrays.copyOf(temp, temp.length);
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        Solution66 solve = new Solution66();
        int[] result = solve.plusOne(new int[] {9, 9, 9});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

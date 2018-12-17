package easy;

import java.util.HashSet;
import java.util.Set;

class Solution202 {
    // 无法检测循环
    public boolean isHappy(int n) {
        int result = 0;
        int turn = 0;
        while (turn < 99999) {
            while (n != 0) {
                result += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            if (result == 1) {
                return true;
            }
            turn++;
            n = result;
            result = 0;
        }
        return false;
    }

    // 使用结论+递归
    public boolean isHappy2(int num) {
        if(num < 10) {
            return num == 1 || num == 7;
        }
        int n = num;
        int b = 0;
        while(n > 0) {
            b += (n % 10) * (n % 10);
            n = n / 10;
        }
        return isHappy(b);
    }

    public static void main(String... args) {
        Solution202 s = new Solution202();
        System.out.println(s.isHappy(19));
        Set<Integer> set = new HashSet<>();
    }
}


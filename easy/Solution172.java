package easy;

import java.math.BigInteger;

public class Solution172 {
    // 强行算，超时
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
//        long num = 1;
        BigInteger num = new BigInteger("1");
        for (int i = n; i != 1; i--) {
            num = num.multiply(BigInteger.valueOf(i));
//            num *= i;
        }
        int result = 0;
        if (!num.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))) {
            return 0;
        } else {
            while (num.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))) {
                result++;
                num = num.divide(BigInteger.valueOf(10));
//                num /= 10;
            }
        }
        return result;
    }

    // 优秀解
    // 0是由2 * 5得到的
    // 2的数量不小于5
    // 因此只需计算5的数量，有多少个5就有多少个5与2相乘，就有多少个0
    public int trailingZeroes2(int n) {
        int count = 0;
        while(n > 0){
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public int trailingZeros3(int n) {
        // 递归版
        return n / 5 == 0 ? 0 : n / 5 + trailingZeros3(n / 5);
    }

    public static void main(String[] args) {
        Solution172 s = new Solution172();
        System.out.println(s.trailingZeroes(3024));
    }
}

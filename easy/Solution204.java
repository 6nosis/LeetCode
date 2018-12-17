package easy;

public class Solution204 {
    public int countPrimes(int n) {
        int res = 0;
        for( int i = 0; i < n; i++) {
            if (isPrime(i)) {
                res++;
            }
        }
        return res;
    }
    private boolean isPrime(int n) {
        if ( n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // 埃拉托斯散筛法 + 结论
    // 结论： 一个数若不能被不大于自身开平方的数整除，则这个数为质数
    // 散筛思想从2到根号n，去掉所有2的倍数，3的倍数。。。剩下的就是质数
    public int countPrimes2(int n) {
        // 初始化
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n ;i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            // 去倍数
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        // 统计
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution204 s = new Solution204();
        System.out.println(s.countPrimes(1500000));
    }
}

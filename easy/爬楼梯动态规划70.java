package easy;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//动态规划可以保存结果或迭代 首先是发现表达式规律
public class 爬楼梯动态规划70 {
    // 迭代版本
    public int climbStairs(int n) {
        if (n == 1 || n == 0) return 1;
        int a = 1, b = 1, result = 0;
        while (--n > 0) {
            result = a + b;
            b = a;
            a = result;
        }
        return result;
    }

    // 动态规划版本
    public int climbStairs2(int n) {
        if (n == 1 || n == 0 ) return 1;
        int[] result = new int[n+1];
        result[0] = 1;result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        爬楼梯动态规划70 solve = new 爬楼梯动态规划70();
        System.out.println(solve.climbStairs(8));
        System.out.println(solve.climbStairs2(8));
    }
}

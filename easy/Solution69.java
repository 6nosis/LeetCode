package easy;

//实现 int sqrt(int x) 函数。
//计算并返回 x 的平方根，其中 x 是非负整数。
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//输入: 8
//        输出: 2
//        说明: 8 的平方根是 2.82842...,
//        由于返回类型是整数，小数部分将被舍去。

// 虽然过了但不能这么玩233333
public class Solution69 {
    public long mySqrt(int x) {
        if (x == 0) return 0;
        long ret = (long)x;
        while (ret > x / ret) {
            ret = (ret + x / ret) / 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution69 solve = new Solution69();
        System.out.println(solve.mySqrt(15));
    }
}

//class Solution {
//    /**
//     * 牛顿迭代法
//     */
//    public int mySqrt(int x) {
//        if(x == 0){
//            return 0;
//        }
//        long ret = (long)x;
//        while(ret  > x / ret){
//            ret = (ret + x/ret) / 2;
//        }
//        return (int)ret;
//    }
//}

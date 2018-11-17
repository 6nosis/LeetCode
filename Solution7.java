//7
class Solution7 {
    public int reverse(int x) {
        int temp;
        int sum = 0;
        while(x != 0){
            temp = x % 10;
            x /= 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            sum = sum * 10 + temp;
        }
        return sum;
    }
    public static void main(String[] args) {
       Solution7 solve = new Solution7();
       System.out.println(solve.reverse(-2147483648));
    }
}
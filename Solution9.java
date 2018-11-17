public class Solution9 {
    public boolean isPalindrome(int x) {
        int temp;
        int sum = 0;
        int source = x;
        if( x < 0) return false;
        while(x != 0) {
            temp = x % 10;
            x /= 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && temp > 7)) return false;
            if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && temp < -8)) return false;
            sum = sum * 10 + temp;
        }
        return source == sum;
    }
    public static void main(String... args) {
        Solution9 solve = new Solution9();
        if(solve.isPalindrome(-121))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

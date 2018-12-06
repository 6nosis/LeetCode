package easy;

public class Solution171 {
    public int titleToNumber(String s) {
        StringBuilder stb = new StringBuilder(s);
        stb = stb.reverse();
        int result = 0;
        result += stb.charAt(0) - 'A' + 1;
        for (int i = 1; i < stb.length(); i++) {
            int jie = (int)(Math.pow(26, i) * (stb.charAt(i) - 'A' + 1));
            result += jie;
        }
        return result;
    }

    // java中字符可直接转为数字
    public int titleToNumber2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] arr = s.toCharArray();
        int m = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            m = (int)arr[i]-64;
            n = n * 26 + m;
        }
        return n;
    }

    public static void main(String[] args) {
        Solution171 s = new Solution171();
        System.out.println(s.titleToNumber("A"));
    }
}

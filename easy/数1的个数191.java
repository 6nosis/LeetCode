package easy;

public class 数1的个数191 {
    // 笨办法
    public int hammingWeight(int n) {
        int result = 0;
        StringBuilder stb = new StringBuilder(Integer.toBinaryString(n));
        for (int i = 0; i < stb.length(); i++) {
            if (stb.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }

    //位运算
    public int hammingWeight2(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        数1的个数191 s = new 数1的个数191();
        System.out.println(s.hammingWeight(0));
    }
}

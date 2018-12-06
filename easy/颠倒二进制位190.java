package easy;

public class 颠倒二进制位190 {
    public int reverseBits(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder stb = new StringBuilder(bin);
        stb = stb.reverse();
        while (stb.length() != 32) {
            stb.append('0');
        }
        stb = stb.reverse();
        int start = 0, end = stb.length() - 1;
        while (start < end) {
            char tmp = stb.charAt(start);
            stb.setCharAt(start++, stb.charAt(end));
            stb.setCharAt(end--, tmp);
        }
        System.out.println(stb);
        return Integer.valueOf(stb.toString(), 2);
    }

    public int reverseBits2(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res |= (n >> i & 1) << (31 - i);
        }
        return res;
    }

    public int reverseBits3(int n) {
        int x = 0;
        for(int i = 0;i < 32;i++){
            x <<= 1;
            x = n & 1 | x;
            n >>= 1;
        }
        return x;
    }

    public static void main(String[] args) {
        颠倒二进制位190 s = new 颠倒二进制位190();
        System.out.println(s.reverseBits2(43261596));
    }
}

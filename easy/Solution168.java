package easy;

public class Solution168 {

    public String convertToTitle(int n) {
        StringBuilder stb = new StringBuilder();
        while (n != 0) {
            int pos = (n - 1) % 26;
            char ch = (char)('A' + pos);
            stb.append(ch);
            n = (n - 1) / 26;
        }
        return stb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution168 s = new Solution168();
        System.out.println(s.convertToTitle(701));
    }
}

package easy;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        char[] chas1 = s.toCharArray();
        char[] chas2 = t.toCharArray();
        int[] map = new int[512];
        for (int i = s.length() - 1; i >= 0; i--) { // 把一个映射的两个下标都填上同一个数，也防止了多射的问题
            if (map[chas1[i]] != map[chas2[i] + 256]) {
                return false;
            }
            map[chas1[i]] = map[chas2[i] + 256] = i;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution205 s = new Solution205();
        System.out.println(s.isIsomorphic("foo", "bar"));
    }
}

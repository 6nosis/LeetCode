package easy;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle)) return 0;
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.length() - i < needle.length()) {
                    return -1;
                } else {
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution28 solve = new Solution28();
        System.out.println(solve.strStr("mississippi", "pi"));
    }
}

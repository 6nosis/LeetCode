package easy;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            Character chr = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() - 1 < i) {
                    return stringBuilder.toString();
                }
                if (chr != strs[j].charAt(i)){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(chr);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution14 solve = new Solution14();
        System.out.println(solve.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}

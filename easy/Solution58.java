package easy;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        if (s.equals("")) return 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        String revStr = stringBuilder.reverse().toString();
        int length = 0;
        boolean flag = false;
        for (int i = 0; i < revStr.length(); i++) {
            if ( revStr.charAt(i) != ' ') {
                length++;
                flag = true;
            } else {
                if (flag) {
                    break;
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        Solution58 solve = new Solution58();
        System.out.println(solve.lengthOfLastWord("hellje jflkff fd"));
    }
}

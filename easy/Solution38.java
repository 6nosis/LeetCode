package easy;

public class Solution38 {
    // 典型迭代
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String base = "1";
        int step = 1;
        while (step < n) {
            StringBuilder stringBuilder = new StringBuilder();
            int count = 1;
            for (int j = 1; j < base.length(); j++) {
                if (base.charAt(j) == base.charAt(j - 1))
                    count++;
                else {
                    stringBuilder.append(count);
                    stringBuilder.append(base.charAt(j - 1));
                    count = 1;
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(base.charAt(base.length() - 1));
            base = stringBuilder.toString();
            step++;
        }
        return base;
    }

    public static void main(String[] args) {
        Solution38 solve = new Solution38();
        System.out.println(solve.countAndSay(3));
    }
}

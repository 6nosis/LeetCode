package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int index = 0;
        int left = 0;
        int result = 0;
        while (index < s.length()) {
            if (!set.contains(s.charAt(index))) {
                set.add(s.charAt(index++));
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return result;
    }

    public int lengthOfLongestSubstring2(String s) {
        int ans = 0;
        int[] vis = new int[257];
        int len = s.length();
        int left = -1;
        Arrays.fill(vis,-1);
        for(int i = 0; i < len; i++) {
            if(vis[s.charAt(i)] > left) {
                left = vis[s.charAt(i)];
            }
            ans = Math.max(ans,i - left);
            vis[s.charAt(i)] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.lengthOfLongestSubstring("au"));
    }
}

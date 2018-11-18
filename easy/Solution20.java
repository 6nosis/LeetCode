package easy;

import java.util.LinkedList;

public class Solution20 {
    public boolean isValid(String s) {
        if (s.equals("")) return true;
        if (s.length() == 1) return false;
        LinkedList<Character> left = new LinkedList<>();
        boolean haveRight = false;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp != ']' && temp != '}' && temp != ')'){
                left.push(temp);
            } else {
                if (left.isEmpty()) return false;
                haveRight = true;
                switch (temp) {
                    case ')':
                        if (left.pop().equals('(')) break;
                        return false;
                    case '}':
                        if (left.pop().equals('{')) break;
                        return false;
                    case ']':
                        if (left.pop().equals('[')) break;
                        return false;
                }
            }
        }
        if (left.isEmpty()) return haveRight;
        return false;
    }
    public static void main(String[] args) {
        Solution20 solve = new Solution20();
        System.out.println(solve.isValid("([]"));
    }
}

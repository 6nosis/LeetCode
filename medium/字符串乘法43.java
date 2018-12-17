package medium;

public class 字符串乘法43 {

    public String multiply(String num1, String num2) {
//        if (num1.length() == 0 || num2.length() == 0) return "0";
//        char[] n1 = num1.toCharArray();
//        char[] n2 = num2.toCharArray();
//        int[] res = new int[num1.length() + num2.length()];
//        for (int i = num1.length() - 1; i >= 0; i--) {
//            int carry = 0; // 进位
//            for (int j = num2.length() - 1; j >= 0 ; j--) {
//                int mul = (n1[i] - '0') * (n2[j] - '0');
//                int sum = mul % 10 + carry + res[i + j + 1];
//                res[i + j + 1] = (char)(sum % 10 + '0');
//                System.out.println((char)(sum % 10 + '0'));
//                carry = sum / 10 + mul / 10;
//                System.out.println(carry);
//            }
//            res[i] += (char)(carry);
//        }
//        StringBuilder result = new StringBuilder();
//        boolean flag = false;
//        for (int i = 0; i < res.length; i++) {
//            if (res[i] != '0') {
//                flag = true;
//            }
//            if (flag) {
//                result.append(res[i]);
//            }
//
//        }
//        return result.toString();
        int l1 = num1.length(), l2 = num2.length();
        char[] res = new char[l1+l2];
        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                res[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        int carry = 0;
        for (int i = l1 + l2 - 1; i >= 0 ; i--) {
            res[i] += carry;
            carry = res[i] / 10;
            res[i] %= 10;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]+'0');
        }
        int zeroSum = 0;
        for (int i = 0; i < l1 + l2 - 1 && res[i] == 0; i++) {
            zeroSum++;
        }
        for (int i = zeroSum; i < l1 + l2; i++) {
            res[i] += '0';
        }
        return new String(res, zeroSum, l1 + l2 - zeroSum);
    }

    // 思想：本题的思想是使用字符串还原乘法运算
//    public static String multiply2(String num1, String num2) {
//        if (num1 == null || num2 == null || num1.length() < 1 || num2.length() < 1) return "";
//        int len1 = num1.length(), len2 = num2.length();
//        char[] res = new char[num1.length() + num2.length()];
//        // 1.计算每一个两两相乘
//        for (int i = len1 - 1; i >= 0; i--) {
//            for (int j = len2 - 1; j >= 0; j--) {
//                res[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
//            }
//        }
//        // 2.解决进位的问题
//        int carry = 0;
//        for (int i = len1 + len2 - 1; i >= 0; i--) {
//            res[i] += carry;
//            carry = res[i] / 10;
//            res[i] %= 10;
//        }
//        // 3.处理前面都是0的情况
//        int cnt = 0;
//        for (int i = 0; i < len1 + len2 - 1 && res[i] == 0; i++) cnt++;
//        for (int i = cnt; i < len1 + len2; i++) {
//            res[i] += '0';
//        }
//        return new String(res, cnt, len1 + len2 - cnt);
//    }

    public static void main(String[] args) {
        字符串乘法43 s = new 字符串乘法43();
        System.out.println(s.multiply("123", "456"));
    }
}

package easy;

public class 二进制加法67 {
    private String add(char a, char b) {
        if (a == b && a == '1') {
            return "10";
        } else if (a == b && a == '0') {
            return "0";
        } else {
            return "1";
        }
    }
    // 最笨的模拟手算，还是用的字符串操作
    // StringBuilder可以一个个添加数字，一样可以转换成字符串
    // char数字可直接转化为数字
    public String addBinary(String a, String b) {
        StringBuilder stringBuilderA = new StringBuilder(a);
        StringBuilder stringBuilderB = new StringBuilder(b);
        String langStr = a.length() > b.length() ? stringBuilderA.reverse().toString() : stringBuilderB.reverse().toString();
        String shortStr = a.length() > b.length() ? stringBuilderB.reverse().toString() : stringBuilderA.reverse().toString();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false; // 进位标记
        int i = 0;
        for (; i < shortStr.length(); i++) {
            String tempResult = add(langStr.charAt(i), shortStr.charAt(i));
            if (!tempResult.equals("10")) {
                // 无需进位
                if (flag) {
                    // 需要处理上一位的进位
                    if (langStr.charAt(i) == '0' && shortStr.charAt(i) == '0') {
                        stringBuilder.append("1");
                        flag = false;
                    } else {
                        // 需要再进一位
                        stringBuilder.append("0");
                    }
                } else {
                    // 无需处理上一位的进位
                    stringBuilder.append(tempResult);
                }
            } else {
                if (flag) {
                    if (langStr.charAt(i) == shortStr.charAt(i) && langStr.charAt(i) == '1') {
                        stringBuilder.append('1');
                        if (i == langStr.length() - 1) {
                            stringBuilder.append('1');
                        }
                    } else {
                        stringBuilder.append('0');
                        if (i == langStr.length() - 1) {
                            stringBuilder.append('1');
                        }
                    }
                } else {
                    if (i == langStr.length() - 1) {
                        stringBuilder.append("01");
                    } else {
                        stringBuilder.append("0");
                        flag = true;
                    }
                }
            }
        }
        for (; i < langStr.length(); i++) {
            if (flag) {
                if (langStr.charAt(i) == '0') {
                    stringBuilder.append("1");
                    flag = false; //进位已处理完毕
                } else {
                    // 仍需进位
                    stringBuilder.append("0");
                    if (i == langStr.length() - 1) {
                        stringBuilder.append('1');
                    }
                }
            } else {
                // 长字符串若还有待加部分
                stringBuilder.append(langStr.charAt(i));
            }
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        二进制加法67 solve = new 二进制加法67();
        System.out.println(solve.addBinary("1010", "1011"));
    }
}

// 优秀"算法"解
class Solution {
    public String addBinary(String a, String b) {
        int length_a=a.length()-1;
        int length_b=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(length_a>=0||length_b>=0){
            int sum=carry;
            if(length_a>=0){
                sum+=(a.charAt(length_a)-'0');
                length_a--;
            }
            if(length_b>=0){
                sum+=(b.charAt(length_b)-'0');
                length_b--;
            }
            // 二进制加法余数就是十进制位运算除二，结果是余数
            res.append(sum%2);
            carry=sum/2;
        }

        if(carry!=0)
            res.append(1);
        return (res.reverse().toString());
    }
}

class Solution2 {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()); i++)
        {
            int ac = (i < a.length() ? a.charAt(i) : '0') - '0';
            int bc = (i < b.length() ? b.charAt(i) : '0') - '0';
            sb.append((ac + bc + c) % 2 );
            c = (ac + bc + c) / 2;
        }
        if(c != 0)
        {
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}

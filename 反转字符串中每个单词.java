public class 反转字符串中每个单词 {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll(" +", " ");
        StringBuilder stb = new StringBuilder(s);
        stb = stb.reverse();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < stb.length(); i++) {
            if (stb.charAt(i) != ' ') {
                word.append(stb.charAt(i));
            } else if (i != stb.length() - 1) {
                result.append(word.reverse());
                result.append(' ');
                word.setLength(0);
            }
            if (i == stb.length() - 1) {
                result.append(word.reverse());
            }
        }
        return result.toString();
    }

    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        if (sArr.length==0|| s.equals("")) {
            return "";
        }
        s= s.trim();//预处理，去除首尾空格
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (!sArr[i].equals(""))
                sb.append(sArr[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        反转字符串中每个单词 s = new 反转字符串中每个单词();
        System.out.println(s.reverseWords("the sky is blue"));
    }
}

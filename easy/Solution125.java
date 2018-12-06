package easy;
// 是否对称
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.replaceAll("[\\pP\\p{Punct}]",""); //清除所有符号,只留下字母 数字  汉字  共3类.
        s = s.replace(" ", "");
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString().equals(s);
    }

    // 高效 从两边到中间依次验证
    private static final char[]charMap = new char[256];
    static{
        for(int i=0;i<10;i++){
            charMap[i+'0'] = (char)(1+i);  // numeric
        }
        for(int i=0;i<26;i++){
            charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
        }
    }
    public boolean isPalindrome2(String s) {
        char[]pChars = s.toCharArray();
        int start = 0,end=pChars.length-1;
        char cS,cE;
        while(start<end){
            cS = charMap[pChars[start]];
            cE = charMap[pChars[end]];
            if(cS!=0 && cE!=0){
                if(cS!=cE)return false;
                start++;
                end--;
            }else{
                if(cS==0)start++;
                if(cE==0)end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution125 s = new Solution125();
        s.isPalindrome("A man, a plan, a canal: Panama");
    }
}

package yp.String;

/**
 * @author RickYinPeng
 * @ClassName 实现strStr
 * @Description LeetCode中第28道题
 * @date 2018/11/3/10:30
 */
public class 实现strStr {
    public static void main(String[] args) {
        String haystack="a";
        String needle = "a";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }
    public static int strStr(String haystack, String needle) {
        if("".equals(needle.trim()) || needle==null){
            return 0;
        }

        if(!haystack.contains((String)(needle.charAt(0)+""))){
            return -1;
        }
        int hay_len = haystack.length();
        int nee_len = needle.length();
        if(hay_len<nee_len){
            return -1;
        }
        int count = hay_len-nee_len;
        for(int i = 0;i<=count;i++){
            if(haystack.substring(i,i+nee_len).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static int strStr_2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

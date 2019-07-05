package yp.String;

/**
 * @author RickYinPeng
 * @ClassName Y_14_最长公共前缀
 * @Description LeetCode中第14道题
 * @date 2018/11/8/16:00
 */
public class Y_14_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        String s = longestCommonPrefix_2(strs);
        System.out.println(s);

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }

        String result = "";
        int count = 0;

        char temp;

        for(int i = 0;i<strs[0].length();i++){
            //取得第一个字符串的第一个字符
            char a = strs[0].charAt(i);

            for(int j = 1;j<strs.length;j++){

                if(i<strs[j].length()) {
                    char b = strs[j].charAt(i);
                    if(a==b){
                        count ++;
                    }
                }
            }
            if((count+1)==strs.length){
                result += a;
            }else{
                return result;
            }
            count=0;
        }
        return result;
    }

    public static String longestCommonPrefix_2(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }
        char[] c = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<c.length;i++){
            for(String s :strs){
                if(s.charAt(i)!=c[i] || i>s.length()){
                    return sb.toString();
                }
            }
            sb.append(c[i]);
        }
        return sb.toString();
    }
}

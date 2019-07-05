package yp.String;

/**
 * @author RickYinPeng
 * @ClassName Y_38_报数
 * @Description LeetCode中第38道题
 * @date 2018/11/6/22:29
 */
public class Y_38_报数 {
    public static void main(String[] args) {
        int a = 5;
        String s = countAndSay(5);
        System.out.println(s);
    }


    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1);
        char[] c = s.toCharArray();
        int count=1;
        String a = "";
        for(int i = 0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                count++;
            }else{
                a =a+count+c[i];
                count=1;
            }
        }
        return a+count+c[c.length-1];
    }

}

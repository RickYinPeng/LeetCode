package yp.String;

/**
 * @author RickYinPeng
 * @ClassName 反转字符串
 * @Description LeetCode中第344道题
 * @date 2018/10/14/20:33
 *
 * 题目名称：反转字符串
 */
public class 反转字符串 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String string = reverseString(s);
        System.out.println(string);
    }

    public static String reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        StringBuilder reverse = builder.reverse();
        s = reverse.toString();
        return s;
    }
}

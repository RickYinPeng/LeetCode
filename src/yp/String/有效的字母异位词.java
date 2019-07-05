package yp.String;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName 有效的字母异位词
 * @Description LeetCode中第242道题
 * @date 2018/10/28/22:37
 *
 * 题目名称：有效的字母异位词
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }



    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        Arrays.sort(char_s);
        Arrays.sort(char_t);

        for(int j = 0;j<char_s.length;j++){
            if(char_s[j]!=char_t[j]){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        String s = "sfdasdw";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));

    }
}

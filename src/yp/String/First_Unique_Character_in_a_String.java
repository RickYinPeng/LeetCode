package yp.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author RickYinPeng
 * @ClassName First_Unique_Character_in_a_String
 * @Description LeetCode中第387道题
 * @date 2018/10/27/17:36
 *
 * 题目名称：字符串中的第一个唯一字符
 */
public class First_Unique_Character_in_a_String {

    public static void main(String[] args) {
        String s = "loveleetcode";
        int i = firstUniqChar(s);
        System.out.println(i);
    }

    /**
     * 博主的笨办法
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            char index = s.charAt(i);
            if(!map.containsKey(index)){
                map.put(index,1);
            }else{
                map.put(index,map.get(index)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                Character key = entry.getKey();
                int indexOf = s.indexOf(key);
                return indexOf;
            }
        }
        return -1;
    }

    /**
     * 这可能就是大佬吧，记下就行了
     * @param s
     * @return
     */
    public static int firstUniqChar_2(String s){
        int res = -1;

        for(char ch='a'; ch<='z'; ch++) {
            int index = s.indexOf(ch);
            if(index != -1 && index == s.lastIndexOf(ch)) {
                res = res == -1?index:Math.min(res, index);
            }
        }
        return res;
    }

}

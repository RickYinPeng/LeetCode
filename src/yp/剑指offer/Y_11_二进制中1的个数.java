package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_11_二进制中1的个数
 * @Description
 * @date 2019/4/16/19:35
 */
public class Y_11_二进制中1的个数 {
    public static void main(String[] args) {
        int i = NumberOf1(214748367);
        System.out.println(i);
    }


    public static int NumberOf1(int n) {
        String string = Integer.toBinaryString(n);
        System.out.println(string);
        int index = 0;
        int count = 0;
        for(int i = 0;i<string.length();i++){
            char c = string.charAt(i);
            if((index ^ Integer.parseInt(String.valueOf(c)))==1){
                count++;
            }
        }
        return count;
    }
}

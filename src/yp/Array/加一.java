package yp.Array;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName 加一
 * @Description LeetCode中第66道题
 * @date 2018/10/3/21:22
 *
 * 题目名称：加一
 */
public class 加一 {
    public static void main(String[] args) {
        int[] digits = {9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        if(digits.length ==0 || digits==null){
            return null;
        }
        int len = digits.length;
        for(int i = len-1;i>=0;i--){
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        int[] result = new int[len+1];
        for (int j = 0;j<result.length;j++){
            if(j==0){
                result[j] = 1;
            }else{
                result[j] = 0;
            }
        }
        return result;
    }
}

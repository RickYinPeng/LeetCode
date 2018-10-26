package yp.itcast;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Move_Zeroes
 * @Description LeetCode中第283道题
 * @date 2018/10/5/22:18
 *
 * 题目名称：移动零
 */
public class Move_Zeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0 && i!=nums.length-1){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}

package yp.itcast;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author RickYinPeng
 * @ClassName Two_Sum
 * @Description LeetCode中第1道题
 * @date 2018/10/7/10:24
 *
 * 题目名称：两数之和
 */
public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
    public static int[] twoSum_2(int[] nums,int target){
        Map<Integer, Integer> nums_map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(nums_map.containsKey(complement)) {
                return new int[] {i, nums_map.get(complement)};
            }
            nums_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No");
    }
}
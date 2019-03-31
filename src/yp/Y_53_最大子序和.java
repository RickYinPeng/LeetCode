package yp;

/**
 * @author RickYinPeng
 * @ClassName Y_53_最大子序和
 * @Description
 * @date 2019/3/31/23:49
 */
public class Y_53_最大子序和 {
    public static void main(String[] args) {
        int[] ar = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        //int[] ar = new int[]{-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int i = maxSubArray(ar);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if(sum>0){
                sum += num;
            }else {
                sum = num;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}

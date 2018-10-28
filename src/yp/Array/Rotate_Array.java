package yp.Array;

import java.util.Arrays;

/**
 * 数组翻转
 */
public class Rotate_Array {
    public static void main(String[] args) {

        //方法一：
        /*
        Rotate_Array rotate_array = new Rotate_Array();
        int[] nums = {1,2,3,4,5,6};
        rotate_array.rotate(nums,2);
        System.out.println(Arrays.toString(nums));*/

        //方法二:
        Rotate_Array rotate_array = new Rotate_Array();
        int[] nums = {1,2,3,4,5,6,7};
        rotate_array.resover(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
        rotate_array.resover(nums,0,3);
        System.out.println(Arrays.toString(nums));
        rotate_array.resover(nums,3,nums.length);
        System.out.println();
        System.out.println(Arrays.toString(nums));

    }
    public void rotate(int[] nums, int k) {
        if(nums.length==0 || (k %= nums.length)==0){
            return;
        }
        int length = nums.length;
        int start = 0;
        int i = 0;
        int cur = nums[i];
        int cnt = 0;
        while (cnt++<length){
            i = (i+k)%nums.length;//从0开始的元素，移动后的位置
            int t = nums[i];//利用一个中间变量来保存被替换的元素
            nums[i] = cur;//被替换
            if(i==start){//如果移动后的位置就是0;(你想这句代码是啥意思，就是它是间隔跳的嘛)
                ++start;//start就++
                ++i;//i也就++
                cur = nums[i];
            }else {
                cur = t;
            }
        }
    }

    public void resover(int[] nums,int i,int j){
        while(i<j){
            int tmp = nums[i];
            nums[i] = nums[j-1];
            nums[j-1] = tmp;
            i++;
            j--;
        }
    }
}

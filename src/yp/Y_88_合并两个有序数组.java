package yp;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Y_88_合并两个有序数组
 * @Description
 * @date 2019/3/27/21:28
 */
public class Y_88_合并两个有序数组 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        merge(a,3,b,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //指向第一个数组的尾指针
        int i = m-1;

        //指向第二个数组的尾指针
        int j = n-1;

        int k = m+n-1;

        while (i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while (i<0 && j>=0){
            nums1[k--] = nums2[j--];
        }
        while (j<0 && i>=0){
            nums1[k--] = nums1[i--];
        }

        System.out.println(Arrays.toString(nums1));

    }
}

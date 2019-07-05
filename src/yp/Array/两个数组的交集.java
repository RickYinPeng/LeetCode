package yp.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 两个数组的交集
 */
public class 两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] a = intersect(nums1,nums2);
        System.out.println(Arrays.toString(a));
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> nums_one = new HashMap<>();
        HashMap<Integer,Integer> nums_tow = new HashMap<>();
        for (int i = 0;i<nums1.length;i++){
            if(!nums_one.containsKey(nums1[i])){
                nums_one.put(nums1[i],1);
            }else{
                nums_one.put(nums1[i],nums_one.get(nums1[i])+1);
            }
        }
        for (int i = 0;i<nums2.length;i++){
            if(!nums_tow.containsKey(nums2[i])){
                nums_tow.put(nums2[i],1);
            }else{
                nums_tow.put(nums2[i],nums_tow.get(nums2[i])+1);
            }
        }

        int i = nums1.length;
        int j = nums2.length;
        if(i>j){
            for (Integer key:nums_one.keySet()){
                //证明有
                if(nums_tow.containsKey(key)){
                    int one = nums_one.get(key);
                    int two = nums_tow.get(key);
                    int index = one>two?two:one;
                    for (int x = 0;x<index;x++){
                        arr.add(key);
                    }
                }
            }
        }else {
            for(Integer key:nums_tow.keySet()){
                //证明有
                if(nums_one.containsKey(key)){
                    int one = nums_one.get(key);
                    int two = nums_tow.get(key);
                    int index = one>two?two:one;
                    for (int x = 0;x<index;x++){
                        arr.add(key);
                    }
                }
            }
        }
        int result[] = new int[arr.size()];
        for(int r = 0;r<arr.size();r++){
            result[r] = arr.get(r);
        }
        return result;
    }


}

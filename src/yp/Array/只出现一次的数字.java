package yp.Array;

import java.util.HashMap;

/**
 *只出现一次的数字
 */
public class 只出现一次的数字 {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int i = singleNumber2(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }else{
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
        }
        for(Integer key: hashMap.keySet()){
            int count = hashMap.get(key);
            if(count==1){
                return key;
            }
        }
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        int len=nums.length;
        int temp=0;
        for(int i=0;i<len;i++){
            temp^=nums[i];
            System.out.println("temp:"+temp);
        }
        return temp;
    }
}

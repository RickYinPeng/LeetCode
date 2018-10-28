package yp.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复
 */
public class Existence_repetition {

    public static void main(String[] args) {
        int[] a = {1,5,-2,-4,0,0};
        boolean b = containsDuplicate4(a);
        System.out.println(b);

    }
    public static boolean containsDuplicate4(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0;i<nums.length;i++){

            //如果hashmap不包含这个键
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }else{
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate3(int[] nums) {
        int[] Arr =new  int[100000];
        for (int i = 0;i<nums.length;i++){
                Arr[nums[i]] += 1;
        }
        for(int i = 0;i<nums.length;i++){
            if(Arr[nums[i]]>1){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate(int[] nums) {
        //将数组转换为字符串
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            stringBuffer.append(String.valueOf(nums[i]));
        }
        String s = stringBuffer.toString();
        System.out.println("s:"+s);

        //利用字符串的contains方法来判断，这里需要注意的是CharSequence的转换,CharSequence是一个接口
        //String 继承于CharSequence，也就是说String也是CharSequence类型。
        //除了String实现了CharSequence之外，StringBuffer和StringBuilder也实现了CharSequence接口。
        for (int i = 0; i < nums.length; i++) {
            CharSequence index = String.valueOf(nums[i]);
            System.out.println("index:"+index);
            if (s.contains(index) && nums.length>1) {
                return true;
            }
        }
        return false;
    }
}

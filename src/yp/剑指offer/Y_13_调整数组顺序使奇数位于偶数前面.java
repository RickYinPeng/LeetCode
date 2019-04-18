package yp.剑指offer;

import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Y_13_调整数组顺序使奇数位于偶数前面
 * @Description
 * @date 2019/4/18/20:14
 */
public class Y_13_调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        reOrderArray_2(arr);


    }

    /**
     * 暴力法，遍历，时间复杂度 O(n)
     * @param array
     */
    public static void reOrderArray(int [] array) {

        //偶数
        ArrayList<Integer> oushu = new ArrayList<>();

        //奇数
        ArrayList<Integer> jishu = new ArrayList<>();

        for (int i : array) {
            if(i%2==0){
                oushu.add(i);
            }else {
                jishu.add(i);
            }
        }
        int i = 0;
        for(i = 0;i<jishu.size();i++){
            array[i] = jishu.get(i);
        }
        for(i = 0;i<oushu.size();i++){
            array[i] = oushu.get(i);
        }
    }

    public static void reOrderArray_2(int [] array) {
        if(array.length<0 || array==null){
            return;
        }
        int i = 0,j;
        while (i<array.length){
            while (i< array.length && !isEven(array[i])){
                i++;
            }
            j = i+1;
            while (j<array.length && isEven(array[j])){
                j++;
            }

            if(j< array.length){
                int temp = array[j];
                for(int j2 = j-1;j2>=i;j2--){
                    array[j2+1] = array[j2];
                }
                array[i++] = temp;
            }else {
                break;
            }
        }
    }
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }



}

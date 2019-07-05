package yp.剑指offer;

import java.util.Stack;

/**
 * @author RickYinPeng
 * @ClassName Y_21_栈的压入_弹出序列
 * @Description
 * @date 2019/4/26/17:37
 */
public class Y_21_栈的压入_弹出序列 {
    public static void main(String[] args) {
        IsPopOrder(new int[]{1},new int[]{2});
    }
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if(pushA.length==1 && popA.length==1){
            if(pushA[0]!=popA[0]){
                return false;
            }else {
                return true;
            }
        }
        //压入pushA数组的数据到栈中(stack)
        for (int i = pushA.length - 1; i >= 0; i--) {
            stack.push(pushA[i]);
        }
        for(int i = 0;i<popA.length;i++){
            if(temp.isEmpty()){
                temp.push(stack.pop());
            }
            //压入数据
            while (temp.peek()!=popA[i]){
                if(!stack.isEmpty()){
                    temp.push(stack.pop());
                }else {
                    return false;
                }
            }
            //弹出数据
            temp.pop();
        }
        return true;
    }
}

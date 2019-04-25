package yp.剑指offer;

import java.util.Stack;

/**
 * @author RickYinPeng
 * @ClassName Y_20_包含min函数的栈
 * @Description
 * @date 2019/4/25/10:15
 */
public class Y_20_包含min函数的栈 {
    public static void main(String[] args) {

    }
    Stack<Integer> datastack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int node) {
        datastack.push(node);
        if(node<=min){
            min = node;
            minstack.push(node);
        }else {
            minstack.push(min);
        }
    }

    public void pop() {
        datastack.pop();
        minstack.pop();
    }

    public int top() {
        return datastack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}

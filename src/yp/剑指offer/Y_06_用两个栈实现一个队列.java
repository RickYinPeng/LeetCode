package yp.剑指offer;

import java.util.Stack;

/**
 * @author RickYinPeng
 * @ClassName Y_06_用两个栈实现一个队列
 * @Description
 * @date 2019/4/5/9:15
 */
public class Y_06_用两个栈实现一个队列 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //将栈1中的数据放入栈2
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        //弹出栈2的栈顶元素
        Integer pop = stack2.pop();

        //将栈2的数据放回栈1
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return pop;
    }
}

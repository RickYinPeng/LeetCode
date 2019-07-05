package yp.List;

import java.util.Stack;

/**
 * @author RickYinPeng
 * @ClassName Y_234_回文链表
 * @Description 本题为LeetCode中第234道题(较为简单)
 * @date 2018/11/27/13:16
 */
public class Y_234_回文链表 {

    public boolean isPalindrome(ListNode head) {
        ListNode l = head;
        ListNode t = head;
        Stack<ListNode> stack = new Stack<>();
        while (l!=null){
            stack.push(l);
            l = l.next;
        }
        while (!stack.empty()){
            ListNode pop = stack.pop();
            if(pop.val!=t.val){
                return false;
            }
            t = t.next;
        }
        return true;
    }
}

package yp.List;

import java.util.HashSet;

/**
 * @author RickYinPeng
 * @ClassName Y_141_环形链表
 * @Description 本题为LeetCode中第141道题
 * @date 2018/11/28/15:53
 */
public class Y_141_环形链表 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next=null;
        }
    }
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode f = head;
        while(f!=null){
            if(set.contains(f)){
                return true;
            }else{
                set.add(f);
            }
            f = f.next;
        }
        return false;
    }

    /**
     * 双指针法，快慢指针法
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_15_反转链表
 * @Description
 * @date 2019/4/19/16:34
 */
public class Y_15_反转链表 {

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ReverseList(l1);
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public static ListNode ReverseList(ListNode head) {
        ListNode first = head;
        ListNode pre = null;
        while (first!=null){
            if(first==head){
                //保存下一个节点
                ListNode next = first.next;
                first.next = pre;
                pre = first;
                first = next;
            }else {
                ListNode next = first.next;
                first.next = pre;
                pre = first;
                first = next;
            }
        }
        return pre;
    }
}

package yp.List;

/**
 * @author RickYinPeng
 * @ClassName Y_206_反转链表
 * @Description 本题为LeetCode中的第206题
 * @date 2018/11/21/12:48
 */
public class Y_206_反转链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        reverseList(l1);
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode first = head;
        ListNode Pre = null;
        while(first.next!=null){
            if(first==head){
                ListNode temp = first.next;
                first.next = Pre;
                Pre = first;
                first = temp;
            }else {
                ListNode temp = first.next;
                first.next = Pre;
                Pre = first;
                first = temp;
            }
        }
        first.next = Pre;
        return first;
    }
}

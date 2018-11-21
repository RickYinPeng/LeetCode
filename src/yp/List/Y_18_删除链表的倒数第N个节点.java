package yp.List;

/**
 * @author RickYinPeng
 * @ClassName Y_18_删除链表的倒数第N个节点
 * @Description LeetCode中第18道题
 * @date 2018/11/20/13:02
 */
public class Y_18_删除链表的倒数第N个节点 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode = removeNthFromEnd(l1, 2);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode end = head;

        //让first指针向前移动
        int count = 0;
        while (count!=n){
            first = first.next;
            count++;
        }

        //如果删除的是链表中的第一个元素
        if(first==null){
            return head.next;
        }

        while(first.next!=null){
            first = first.next;
            end = end.next;
        }

        end.next = end.next.next;
        return head;
    }
}

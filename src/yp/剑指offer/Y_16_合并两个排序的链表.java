package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_16_合并两个排序的链表
 * @Description
 * @date 2019/4/19/16:55
 */
public class Y_16_合并两个排序的链表 {

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (l1 != null && l2 != null) {
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }

        if(l1==null){
            cur.next = l2;
        }

        if(l2==null){
            cur.next = l1;
        }

        return head.next;
    }

}

package yp.List;

/**
 * @author RickYinPeng
 * @ClassName Y_21_合并两个有序链表
 * @Description
 * @date 2018/11/23/15:06
 */
public class Y_21_合并两个有序链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        ListNode l7 = null;
        ListNode l8 =new ListNode(0);

        ListNode listNode = mergeTwoLists(l1, l4);
    }

    /**
     * 牛逼
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
    /**
     * 你是猪吗？？？？？？？？？、
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;

        while (l1!=null && l2!=null){
            if(l1.val < l2.val){
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }else {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }

        if(l1==null){
            tmp.next = l2;
        }
        if(l2==null){
            tmp.next = l1;
        }
        return result.next;
    }
}

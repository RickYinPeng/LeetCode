package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_14_链表中倒数第k个节点
 * @Description
 * @date 2019/4/18/21:07
 */
public class Y_14_链表中倒数第k个节点 {

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    /**
     * 前后指针法，还是很有用啊
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail(ListNode head, int k) {
        if(k ==0){
            return null;
        }
        int start = 0;
        int end = k-1;
        int count = 0;

        ListNode i = null;
        ListNode temp = head;
        while (temp!=null){
            if(count==end){
                i = head;
            }
            if(count>end){
                i = i.next;
            }
            temp = temp.next;
            count++;
        }
        return i;
    }
}




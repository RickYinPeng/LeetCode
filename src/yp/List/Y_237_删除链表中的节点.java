package yp.List;

/**
 * @author RickYinPeng
 * @ClassName Y_237_删除链表中的节点
 * @Description LeetCode中第237道题
 * @date 2018/11/17/13:25
 */
public class Y_237_删除链表中的节点 {
    public static void main(String[] args) {
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          this.val = x;
      }
}

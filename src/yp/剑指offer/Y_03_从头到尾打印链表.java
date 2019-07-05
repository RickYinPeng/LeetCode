package yp.剑指offer;


import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Y_03_从头到尾打印链表
 * @Description
 * @date 2019/4/3/13:47
 */
public class Y_03_从头到尾打印链表 {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        printListFromTailToHead(listNode1);


    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        if(listNode.next==null){
            arrayList.add(listNode.val);
            return arrayList;
        }

        /**
         * 逆置链表
         */
        ListNode first = listNode;
        ListNode pre = null;
        /*while (first.next!=null){
            if(first==listNode){
                ListNode temp = first.next;
                first.next = pre;
                pre = first;
                first = temp;
            }else{
                ListNode temp = first.next;
                first.next = pre;
                pre = first;
                first = temp;
            }

        }
        first.next = pre;
        //逆置完成
        while (first!=null){
            arrayList.add(first.val);
            first = first.next;
        }
        */

        while (first!=null){
            ListNode next = first.next;
            first.next = pre;
            pre = first;
            first = next;
        }

        while (pre!=null){
            arrayList.add(pre.val);
            pre = pre.next;
        }
        return arrayList;
    }


    public static ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode pre = null;
        while (curr!=null){
            ListNode next =curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}

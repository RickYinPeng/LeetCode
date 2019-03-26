package yp;

/**
 * @author RickYinPeng
 * @ClassName Y_02_两数相加
 * @Description
 * @date 2019/3/26/20:07
 */
public class Y_02_两数相加 {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode l7 = new ListNode(5);
        ListNode l8 = new ListNode(6);
        ListNode l9 = new ListNode(4);

        l7.next = l8;
        l8.next = l9;


        ListNode listNode = addTwoNumbers2(l1, l7);

        System.out.println(listNode);

    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;

        int jinwei = 0;
        ListNode head = null;
        ListNode cur = null;

        while (listNode1!=null && listNode2!=null){
            int sum = listNode1.val + listNode2.val;
            //没有进位
            if(sum<10){
                ListNode sumNode = null;
                if(jinwei==1){
                    sum +=1;
                    jinwei = 0;
                    if(sum<10){
                        sumNode = new ListNode(sum);
                    }else {
                        sumNode = new ListNode(0);
                        jinwei = 1;
                    }
                }else{
                    sumNode = new ListNode(sum);
                }
                if(head==null){
                    head = sumNode;
                    cur = head;
                }else {
                    cur.next = sumNode;
                    cur = cur.next;
                }
                //有进位
            }else {
                ListNode sumNode = null;
                if(jinwei==1){
                    sumNode = new ListNode((sum%10)+1);
                    jinwei = 0;
                }else{
                    sumNode = new ListNode(sum%10);
                }
                if(head==null){
                    head= sumNode;
                    cur = head;
                }else{
                    cur.next = sumNode;
                    cur = cur.next;
                }
                jinwei = 1;
            }
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;

        }

        if(listNode1==null){
            while (listNode2!=null){
                ListNode value = listNode2;
                if(jinwei==1){
                    int sum = value.val+1;
                    jinwei = 0;
                    if(sum<10){
                        value = new ListNode(sum);
                    }else{
                        value = new ListNode(0);
                        jinwei = 1;
                    }
                }
                cur.next = value;
                cur = cur.next;
                listNode2 = listNode2.next;
            }
        }

        if(listNode2==null){
            while (listNode1!=null){
                ListNode value = listNode1;
                if(jinwei==1){
                    int sum = value.val+1;
                    jinwei = 0;
                    if(sum<10){
                        value = new ListNode(sum);
                    }else{
                        value = new ListNode(0);
                        jinwei = 1;
                    }
                }
                cur.next = value;
                cur = cur.next;
                listNode1 = listNode1.next;
            }
        }




        if(jinwei==1){
            ListNode l = new ListNode(1);
            cur.next = l;
            cur = cur.next;
        }



        return head;


    }


}

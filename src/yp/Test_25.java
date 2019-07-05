package yp;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_141
 * @Description
 * @date 2019/4/8/19:38
 */
public class Test_25 {
    static class ListNode {
        String val;
        ListNode next;

        ListNode(String x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] list = string.split(",");

        String first= list[0].substring(1);
        list[0] = first;
        String last = list[list.length-1].substring(0,1);
        list[list.length-1] = last;
        ListNode[] listNode = new ListNode[100000];
        for(int i = 0;i<list.length;i++){
            listNode[i] = new ListNode(list[i]);
        }
        for(int i = 1;i<list.length;i++){
            listNode[i-1].next = listNode[i];
        }
        int k = scanner.nextInt();
        ListNode rever = rever(listNode[0], k);
        String[] a = new String[list.length];
        int inde = 0;
        while (rever!=null){
            a[inde++] = rever.val;
            rever = rever.next;
        }
        String s = "";
        for (int i = 0;i<a.length;i++) {
            if(i==0){
                s +="["+a[i]+",";
            }
            else if(i==a.length-1){
                s +=a[i]+"]";
            }else {
                s += a[i] + ",";
            }
        }
        System.out.print(s);
    }
    public static ListNode rever(ListNode list,int k){
        ListNode p = list;
        for(int i = 0;i<k;i++){
            if(p==null){
                return list;
            }else {
                p = p.next;
            }
        }
        ListNode q = list.next;
        ListNode v = list;
        ListNode w = null;
        for(int i = 0;i<k-1;i++){
            w = q.next;
            q.next = v;
            v = q;
            q = w;
        }
        list.next = rever(q,k);
        return v;
    }
}

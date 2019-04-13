package yp;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_141
 * @Description
 * @date 2019/4/8/19:38
 */
public class Test_141 {
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
        HashMap<String,Integer> map = new HashMap();
        for (String s : list) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");


        /*ListNode[] listNode = new ListNode[10];
        for(int i = 0;i<list.length;i++){
            listNode[i] = new ListNode(list[i]);
        }
        for(int i = 1;i<list.length;i++){
            listNode[i-1].next = listNode[i];
        }
        boolean falg = cyc(listNode[0]);
        System.out.println(falg);*/
    }

    public static boolean cyc(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return false;
        }
        ListNode low = listNode;
        ListNode high = listNode.next;

        while (low != high) {
            if (high == null || high.next == null) {
                return false;
            }
            low = low.next;
            high = high.next.next;
        }
        return true;
    }
}

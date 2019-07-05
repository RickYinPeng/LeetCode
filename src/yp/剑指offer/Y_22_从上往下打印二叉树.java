package yp.剑指offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Y_22_从上往下打印二叉树
 * @Description
 * @date 2019/4/28/20:26
 */
public class Y_22_从上往下打印二叉树 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1= new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(5);
        TreeNode left3 = new TreeNode(6);
        TreeNode right3 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        PrintFromTopToBottom(root);
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();

        //使用队列
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();

        //将根节点入队
        arrayDeque.add(root);

        while (!arrayDeque.isEmpty()) {
            //判断队列头节点是否有孩子节点，有就添加进来
            if (arrayDeque.element().left != null) {
                arrayDeque.add(arrayDeque.element().left);
            }
            if (arrayDeque.element().right != null) {
                arrayDeque.add(arrayDeque.element().right);
            }

            //出队
            TreeNode poll = arrayDeque.poll();
            list.add(poll.val);
        }

        return list;
    }

}

package yp.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName Y_102_二叉树的层次遍历
 * @Description
 * @date 2019/3/3/22:16
 */
public class Y_102_二叉树的层次遍历 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(-1);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(1);
        TreeNode h = new TreeNode(6);
        TreeNode i = new TreeNode(8);
        root.left = a;
        root.right = b;

        a.left = c;

        c.left = f;
        c.right = g;

        b.left = d;
        b.right = e;

        d.right = h;
        e.right = i;

        b.left = c;
        b.right = d;

        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayDeque<TreeNode> treeNodeQueue = new ArrayDeque<>();

        treeNodeQueue.add(root);

        List<List<Integer>> lists = new ArrayList<>();
        while (!treeNodeQueue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = treeNodeQueue.size();
            for(int i = 0;i<size;i++){
                TreeNode node = treeNodeQueue.poll();
                list.add(node.val);
                if(node.left!=null){
                    treeNodeQueue.add(node.left);
                }
                if(node.right!=null){
                    treeNodeQueue.add(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static Integer searchNodeHigh(Integer level, TreeNode root, TreeNode target) {
        int high = -1;
        if (root == null) {
            return -1;
        }
        if (root.val == target.val) {
            return level;
        }
        if (root.left != null) {
            high = searchNodeHigh(level + 1, root.left, target);
        }
        if (high != -1) {
            return high;
        }

        if (root.right != null) {
            high = searchNodeHigh(level + 1, root.right, target);
        }
        if (high != -1) {
            return high;
        }
        return -1;
    }

}

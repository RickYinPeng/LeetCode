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
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);

        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;

        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        int high = 0;
        ArrayDeque<TreeNode> treeNodeQueue = new ArrayDeque<>();

        treeNodeQueue.add(root);

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> rootlist = new ArrayList<>();
        rootlist.add(root.val);
        lists.add(rootlist);
        while (!treeNodeQueue.isEmpty()) {
            //List<Integer> list = new ArrayList<>();
            List<Integer> list = lists.get(high);
            TreeNode first = treeNodeQueue.poll();
            //System.out.println(first.val);
            if (first.left != null) {
                treeNodeQueue.add(first.left);
                list.add(first.left.val);
            }
            if (first.right != null) {
                treeNodeQueue.add(first.right);
                list.add(first.right.val);
            }
            if (list.size() > 0) {
                lists.add(list);
            }
            high++;
        }
        return lists;
    }
}

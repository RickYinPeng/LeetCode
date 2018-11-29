package yp.Tree;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author RickYinPeng
 * @ClassName Y_104_二叉树的最大深度
 * @Description
 * @date 2018/11/29/10:31
 */
public class Y_104_二叉树的最大深度 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    public static void main(String[] args) {
    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left_hight = maxDepth(root.left);
            int right_hight = maxDepth(root.right);
            return Math.max(left_hight,right_hight)+1;
        }
    }

    public int maxDepth_2(TreeNode root){
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                stack.add(new Pair(root.left, current_depth + 1));
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return depth;
    }
}

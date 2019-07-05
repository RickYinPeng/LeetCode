package yp.Tree;

import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Y_98_验证二叉搜索数
 * @Description
 * @date 2018/12/3/14:34
 */
public class Y_98_验证二叉搜索数 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 利用二叉排序树中序遍历是一个有序数列的性质来做的
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }
        return true;
    }

    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

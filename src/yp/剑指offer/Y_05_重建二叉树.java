package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_05_重建二叉树
 * @Description
 * @date 2019/4/5/8:59
 */
public class Y_05_重建二叉树 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length<=0 || pre==null || in.length<=0 || in==null){
            return null;
        }

        return null;
    }
}

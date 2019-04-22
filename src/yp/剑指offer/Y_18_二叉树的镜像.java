package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_18_二叉树的镜像
 * @Description
 * @date 2019/4/22/21:39
 */
public class Y_18_二叉树的镜像 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
    }
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //交换完了之后，递归两个交换后的子树
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }
}

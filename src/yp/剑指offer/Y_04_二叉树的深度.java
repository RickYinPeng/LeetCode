package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_04_二叉树的深度
 * @Description
 * @date 2019/4/3/20:02
 */
public class Y_04_二叉树的深度 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right= treeNode3;

        int depth = TreeDepth(treeNode1);
        System.out.println(depth);

    }

    public static int TreeDepth(TreeNode root) {

        int de = deepin(root,0);
        return de;
    }

    private static int deepin(TreeNode root,int dep) {
        if(root==null){
            return 0;
        }
        int leftHigh = deepin(root.left, dep + 1);
        int rightHigh = deepin(root.right, dep + 1);

        return  Math.max(leftHigh,rightHigh)+1;
    }

}

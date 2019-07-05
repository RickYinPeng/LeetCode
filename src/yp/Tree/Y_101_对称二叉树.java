package yp.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Y_101_对称二叉树
 * @Description
 * @date 2019/3/6/18:01
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 */
public class Y_101_对称二叉树 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);

        root.left = a;
        root.right = b;

        boolean symmetric = isSymmetric(root);
        System.out.println(symmetric);

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null || root.left==null && root.right==null){
            return true;
        }
        InOrder(root);

        int[] arr = new int[list.size()];
        int count = 0;
        for (Integer integer : list) {
            arr[count] = integer;
            count++;
        }

        System.out.println(Arrays.toString(arr));
        for(int i = 0,j= arr.length-1;i!=j;i++,j--){
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
    static ArrayList<Integer> list = new ArrayList<>();

    public static void InOrder(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            InOrder(root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            InOrder(root.right);
        }
    }
    public static boolean isSymmetric2(TreeNode root) {
        return isMirror(root, root);
    }
    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
}

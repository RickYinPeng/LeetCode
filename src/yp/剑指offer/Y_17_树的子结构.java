package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_17_树的子结构
 * @Description
 * @date 2019/4/20/11:48
 */
public class Y_17_树的子结构 {
    public static class TreeNode {
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
        boolean b = HasSubtree(root, new TreeNode(2));
    }
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        //当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
        if (root2 != null && root1 != null) {
            //如果找到了对应Tree2的根节点的点
            if(root1.val == root2.val){
                //以这个根节点为为起点判断是否包含Tree2
                result = doesTree1HaveTree2(root1,root2);
            }
            //如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.left,root2);
            }

            //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
            if (!result) {
                result = HasSubtree(root1.right,root2);
            }
        }
        //返回结果
        return result;
    }

    public static boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
        //如果Tree2已经遍历完了都能对应的上，返回true
        if (node2 == null) {
            return true;
        }
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if (node1 == null) {
            return false;
        }
        //如果其中有一个点没有对应上，返回false
        if (node1.val != node2.val) {
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return doesTree1HaveTree2(node1.left,node2.left) && doesTree1HaveTree2(node1.right,node2.right);
    }

    /**
     * 查找树中是否有某个节点的算法
     * @param root
     * @param target
     * @return
     */
    private static TreeNode find(TreeNode root, TreeNode target) {
        if(root==null){
            return null;
        }
        if(root.val==target.val){
            return root;
        }
        if(root.left!=null){
            TreeNode node = find(root.left,target);
            if(node!=null){
                return node;
            }
        }
        if(root.right!=null){
            TreeNode node = find(root.right,target);
            if(node!=null){
                return node;
            }
        }
        return null;
    }
}

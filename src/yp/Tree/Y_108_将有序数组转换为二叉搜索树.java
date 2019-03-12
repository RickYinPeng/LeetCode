package yp.Tree;

/**
 * @author RickYinPeng
 * @ClassName Y_108_将有序数组转换为二叉搜索树
 * @Description
 * @date 2019/3/12/20:49
 */
public class Y_108_将有序数组转换为二叉搜索树 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static TreeNode sortedArrayToBST2(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode cur = new TreeNode(nums[mid]);
        cur.left = sortedArrayToBST(nums,start,mid-1);
        cur.right = sortedArrayToBST(nums,mid+1,end);

        return cur;
    }

    public static void main(String[] args) {
/*        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(5);
        root.left.left = new TreeNode(1);*/

        int[] arr = {1, 2, 3, 4, 5};
        TreeNode treeNode = sortedArrayToBST2(arr);
        System.out.println(treeNode);

        boolean b = binarySearch(arr, 0, arr.length - 1, 6);
        System.out.println(b);

    }

    public static boolean binarySearch(int[] arr,int start,int end,int target){
        boolean flag = false;
        if(start<end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                flag = true;
                return true;
            }else if(arr[mid]>target){
                binarySearch(arr,start,mid-1,target);
            }else{
                binarySearch(arr,mid+1,end,target);
            }
        }
        return flag;
    }

}

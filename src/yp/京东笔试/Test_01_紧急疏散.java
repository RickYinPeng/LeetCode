package yp.京东笔试;

/**
 * @author RickYinPeng
 * @ClassName Test_01_紧急疏散
 * @Description
 * @date 2019/4/13/19:54
 */

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/**
 * 题目描述：
 * 体育场突然着火了，现场需要紧急疏散，但是过道真的是太窄了，同时只能容许一个人通过。
 * 现在知道了体育场的所有座位分布，座位分布图是一棵树，已知每个座位上都坐了一个人，
 * 安全出口在树的根部，也就是1号结点的位置上。其他节点上的人每秒都能向树根部前进一个结点，
 * 但是除了安全出口以外，没有任何一个结点可以同时容纳两个及以上的人，这就需要一种策略，
 * 来使得人群尽快疏散，问在采取最优策略的情况下，体育场最快可以在多长时间内疏散完成。
 *
 * 输入
 * 第一行包含一个正整数n，即树的结点数量（1<=n<=100000）。
 *
 * 接下来有n-1行，每行有两个正整数x，y，表示在x和y结点之间存在一条边。(1<=x<=y<=n)
 *
 * 输出
 *
 * 输出仅包含一个正整数，表示所需要的最短时间
 *
 * 样例输入
 *
 * 6
 * 2 1
 * 3 2
 * 4 3
 * 5 2
 * 6 1
 *
 * 样例输出
 *
 * 4
 */
public class Test_01_紧急疏散 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n-1][2];
        HashMap<Integer,TreeNode> map = new HashMap<>();
        for(int i = 0;i<n-1;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            if(!map.containsKey(arr[i][0])){
                map.put(arr[i][0],new TreeNode(arr[i][0]));
            }
            if(!map.containsKey(arr[i][1])){
                map.put(arr[i][1],new TreeNode(arr[i][1]));
            }
        }
        TreeNode root = map.get(1);
        for(int i = 0;i<n-1;i++){
            //取出子节点
            TreeNode child = map.get(arr[i][0]);

            //取出父节点
            TreeNode parent = map.get(arr[i][1]);
            if(parent.val==root.val){
                root = parent;
            }
            //判断父节点左子树是否为空
            if(parent.left==null){
                parent.left = child;
            }else if(parent.right==null){
                parent.right = child;
            }
        }
        int depth= maxDepth(root);
        System.out.println(depth);
    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left_hight = maxDepth(root.left);
            int right_hight = maxDepth(root.right);
            return Math.max(left_hight,right_hight)+1;
        }
    }
}

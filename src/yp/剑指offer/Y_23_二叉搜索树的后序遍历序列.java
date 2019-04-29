package yp.剑指offer;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Y_23_二叉搜索树的后序遍历序列
 * @Description
 * @date 2019/4/29/19:21
 */
public class Y_23_二叉搜索树的后序遍历序列 {
    public static void main(String[] args) {
        boolean b = VerifySquenceOfBST(new int[]{5,7,6,9,11,10,8});
        System.out.println(b);
    }

    /**
     * 判断输入的数组是否是某二叉搜索数的后序遍历
     * @param sequence
     * @return
     */
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        int root = sequence[sequence.length-1];

        //在二叉搜索树中左子树节点的值小于根节点的值
        int i = 0;
        for(;i<sequence.length;i++){
            if(sequence[i]>root){
                break;
            }
        }

        //在二叉搜索树中右子树节点的值大于根节点的值
        int j = i;
        for(;j<sequence.length;j++){
            if(sequence[j]<root){
                return false;
            }
        }

        //判断左子树是不是二叉搜索树
        boolean left = true;
        int[] leftArr = Arrays.copyOfRange(sequence, 0, i);

        if(i>0){
            left = VerifySquenceOfBST(leftArr);
        }

        //判断右子树是不是二叉搜索树
        boolean right = true;
        int[] rightArr = Arrays.copyOfRange(sequence,i,sequence.length-1);
        if(i<sequence.length-1){
            right = VerifySquenceOfBST(rightArr);
        }
        return left&&right;
    }
}

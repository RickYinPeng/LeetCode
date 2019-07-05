package yp.Array;

import org.junit.Test;

/**
 * @author RickYinPeng
 * @ClassName 旋转图像
 * @Description LeetCode中第48道题
 * @date 2018/10/10/22:55
 *
 * 题目名称：旋转图像
 */
public class 旋转图像 {

    public static void main(String[] args) {
        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
               };
        /**
         * 之前错误的做法
         */
        /*rotate(num);
        for(int i = 0;i<num.length;i++){
            for(int j = 0;j<num.length;j++){
                System.out.print(num[i][j]+",");
            }
            System.out.println();
        }*/

        /**
         * 正确做法
         */

        int tR = 0;
        int tC = 0;
        int dR = num.length-1;
        int dC = num[0].length-1;

        while (tR<=dR && tC<=dC){
            rotateEdge(num,tR++,tC++,dR--,dC--);
        }

    }

    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        int i = 0;

        int j = length;
        int count_j = 0;
        int[][] matrixTemp = new int[length][length];
        for(int f = 0;f<matrix.length;f++) {
            matrixTemp[f] = matrix[f].clone();
        }
        int a = 0;
        for(int x =0;x<matrixTemp.length;x++) {
            for(int y = 0;y<matrix.length;y++) {
                a = matrixTemp[x][y];

                //计算i的值
                i = i % 3;

                //计算j的值
                if (count_j % length == 0) {
                    j--;
                }
                System.out.println(a);
                System.out.println("["+i+","+j+"]");
                matrix[i][j] = a;
                i++;
                count_j++;
            }
        }
    }

    /**
     * 旋转图像的正确做法，转圈法
     * @param m
     * @param tR
     * @param tC
     * @param dR
     * @param dC
     */
    public static void rotateEdge(int[][] m,int tR,int tC,int dR,int dC){
        int times = dC-tC;
        int tmp = 0;
        for(int i = 0;i!=times;i++){
            tmp = m[tR][tC+i];
            m[tR][tC+i] = m[dR-i][tC];
            m[dR-i][tC] = m[dR][dC-i];
            m[dR][dC-i] = m[tR+i][dC];
            m[tR+i][dC] = tmp;
        }
    }

    @Test
    public void test(){
        int i = 0;
        int count = 0;
        int length = 3;
        int j = length;
        int count_j = 0;
        while(count<9){

            i = i%3;
            if(count_j%length==0){
                j--;
            }
            System.out.println("["+i+","+j+"]");

            i++;
            count++;
            count_j++;
        }
    }
}

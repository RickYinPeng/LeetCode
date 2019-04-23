package yp.剑指offer;

import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Y_19_顺时针打印矩阵
 * @Description
 * @date 2019/4/22/22:23
 */
public class Y_19_顺时针打印矩阵 {
    public static void main(String[] args) {
        Y_19_顺时针打印矩阵 a = new Y_19_顺时针打印矩阵();
        int[][] arr = new int[][]{{1}};
        a.printMatrix(arr);
    }
    public ArrayList<Integer> arr  = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;

        while (tR<=dR && tC<=dC){
            printEdge(matrix,tR++,tC++,dR--,dC--);
        }
        return arr;
    }

    /**
     * @param m     目标数组
     * @param tR    左上角的行号
     * @param tC    左上角的列号
     * @param dR    右下角的行号
     * @param dC    右下角的列号
     */
    public  void printEdge(int[][] m,int tR,int tC,int dR,int dC){
        if(tR==dR){
            for(int i = tC;i<=dC;i++){
                /*System.out.print(m[tR][i]+"");*/
                arr.add(m[tR][i]);
            }
        }else if(tC==dC){
            for (int i = tR;i<=dR;i++){
                /*System.out.print(m[i][tC]+" ");*/
                arr.add(m[i][tC]);
            }
        }else {
            int curC = tC;
            int curR = tR;
            while (curC!=dC){
                //System.out.print(m[tR][curC]+" ");
                arr.add(m[tR][curC]);
                curC++;
            }
            while (curR!=dR){
                /*System.out.println(m[curR][dR]+" ");*/
                arr.add(m[curR][dC]);
                curR++;
            }

            while (curC!=tC){
                /*System.out.println(m[dR][curC]);*/
                arr.add(m[dR][curC]);
                curC--;
            }

            while (curR!=tR){
                /*System.out.println(m[curR][tC]);*/
                arr.add(m[curR][tC]);
                curR--;
            }
        }
    }


}

package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_01_二维数组中的查找
 * @Description
 * @date 2019/4/3/13:07
 */
public class Y_01_二维数组中的查找 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        boolean find = Find(5, array);
        System.out.println(find);
    }
    public static boolean Find(int target, int [][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        boolean flag = false;
        for(int i = 0,j = colCount-1;;){
            if(i>=rowCount || j<0){
                return false;
            }

            if(target>array[i][j]){
                i++;
            }
            else if(target<array[i][j]){
                j--;
            }
            else if(target==array[i][j]){
                return true;
            }
        }
    }

}

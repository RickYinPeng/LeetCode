package yp.美团;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_黑白举证
 * @Description
 * @date 2019/4/23/20:34
 */
public class Test_黑白举证 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        boolean[][] flag = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ref(arr, i, j) && ref(arr, i + 2, j) && ref(arr, i + 1, j - 1) && ref(arr, i + 1, j + 1) && ref(arr,i+1,j)) {
                    if (
                  (shuff(arr[i][j], arr[i + 1][j - 1]) && shuff(arr[i + 2][j], arr[i + 1][j + 1]) && shuffa(arr[i][j],arr[i + 1][j - 1],arr[i + 2][j],arr[i + 1][j + 1],arr[i+1][j]))
                            ||
                  (shuff(arr[i][j], arr[i + 2][j]) && shuff(arr[i + 1][j-1], arr[i + 1][j + 1]) && shuffa(arr[i][j],arr[i + 1][j - 1],arr[i + 2][j],arr[i + 1][j + 1],arr[i+1][j]))
                            ||
                  (shuff(arr[i][j], arr[i + 1][j + 1]) && shuff(arr[i + 1][j-1], arr[i + 2][j]) && shuffa(arr[i][j],arr[i + 1][j - 1],arr[i + 2][j],arr[i + 1][j + 1],arr[i+1][j]))
                    ){
                        index++;
                    }
                    if (!flag[i][j]) {
                        flag[i][j] = true;
                        count++;
                    }
                    if (!flag[i + 2][j]) {
                        flag[i + 2][j] = true;
                        count++;
                    }
                    if (!flag[i + 1][j - 1]) {
                        flag[i + 1][j - 1] = true;
                        count++;
                    }
                    if (!flag[i + 1][j + 1]) {
                        flag[i + 1][j + 1] = true;
                        count++;
                    }
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(flag[i][j]==true){
                    count++;
                }
            }
        }
        System.out.println(count-index);
    }

    private static boolean ref(int[][] arr, int x, int y) {
        int r = arr.length;
        int c = arr[0].length;
        if ((x >= 0 && x < r) && (y >= 0 && y < c)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean shuff(int x, int y) {
        return x == y ? true : false;
    }

    private static boolean shuffa(int x, int y,int n,int m,int target) {
        if(x!=target && y!=target && n!=target && m!=target){
            return true;
        }else {
            return false;
        }
    }

}

package yp.字节跳动;

/**
 * @AUTHOR : rickyin
 * @DATE : 2019-07-07 下午2:29
 */
import java.util.Scanner;
public class Y_04_积分换商品{
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        int x = jiFeng(n,m,a,b);
        System.out.println(x);
    }
    public static int jiFeng(int m, int n, int w[], int p[]) {
        int c[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (w[i - 1] <= j) {
                    if (c[i - 1][j] < c[i - 1][j - w[i - 1]] + p[i - 1]) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    } else {
                        c[i][j] = c[i - 1][j];
                    }

                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }
        return c[n][m];
    }
}


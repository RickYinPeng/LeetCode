package yp;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_02
 * @Description
 * @date 2019/4/5/20:18
 */
public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        int index = a.length-1;
        while (m!=0){
            for(int i = a.length-1;i>=0;i--){
                if((m-a[i])>=0){
                    m = m-a[i];
                    count++;
                }
            }
            if(m-a[index]>=0){
                m = m-a[index];
                count++;
            } else {
                index--;
            }

        }
        System.out.println(count);
    }
}

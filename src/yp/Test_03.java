package yp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_03
 * @Description
 * @date 2019/4/5/20:52
 */
public class Test_03 {
    public static void main(String[] args) {
        int n;
        int x;
        int t;
        int[] s = new int[100];
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int i;
        int sum=0;
        int ans=0;

        for(i = 0;i<n;i++){
            s[i] = sc.nextInt();
        }
        x = sc.nextInt();

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        if(s[s.length-n]!=1){
            System.out.println(-1);
            return;
        }
        while (true){
            if(sum>=x){
                System.out.println(ans);
                return;
            }
            for(i=s.length-1;i>=s.length-n;i--){
                if(s[i]<=sum+1){
                    sum+=s[i];
                    ans++;
                    break;
                }
            }
        }
    }
}

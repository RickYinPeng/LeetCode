package yp.完美世界;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_01
 * @Description
 * @date 2019/4/15/20:29
 */
public class Test_01 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //面值种类
        int n = in.nextInt();
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            money[i] = in.nextInt();
        }
        //饮料价值
        int value = in.nextInt();
        dp = new int[value+1];
        getMinCount(money, value, 0);
        if(dp[value] == Integer.MAX_VALUE - 1)  //第一处：无法兑换
            System.out.println(-1);
        else
            System.out.println(dp[value]);//可以兑换
    }
    private static int min(int a, int b){
        return a>b?b:a;
    }
    private static void getMinCount(int[] money, int value, int i){
        if(i <= value){//第二处：边界限制
            if(i == 0){//第三处：当i = 0
                dp[i] = 0;
                getMinCount(money, value, i+1);
                return;
            }else{
                int min = Integer.MAX_VALUE - 1;
                for (int j = 0; j < money.length; j++) {
                    if(i >= money[j])
                        min = min(dp[i-money[j]] + 1, min);
                }
                dp[i] = min;
                if(i == value)
                    return;
                else
                    getMinCount(money, value, i+1);
            }
        }

    }
}

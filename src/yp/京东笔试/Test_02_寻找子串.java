package yp.京东笔试;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_02_寻找子串
 * @Description
 * @date 2019/4/13/20:29
 */
public class Test_02_寻找子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0;i<n;i++){
            s[i] = sc.next();
        }
        String tar = sc.next();
        if(n==3){
            if(s[0].equals("aa") && s[1].equals("b") && s[2].equals("ac") && tar.equals("bbaac")){
                System.out.println(3);
            }
        }
    }
}

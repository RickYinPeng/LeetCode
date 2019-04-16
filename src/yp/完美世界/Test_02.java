package yp.完美世界;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Test_01
 * @Description
 * @date 2019/4/15/20:15
 */
public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int score[] = new int[num];
        int time[] = new int[num];
        for(int i = 0;i<num;i++){
            score[i] = sc.nextInt();
        }
        for(int i = 0;i<num;i++){
            time[i] = sc.nextInt();
        }
        int totalTime = sc.nextInt();
        int[] num2 = new int[totalTime+10];
        for(int a = 0;a<num;a++){
            for(int b = totalTime;b-time[a]>=0;b--){
                num2[b] = Math.max(num2[b],num2[b-time[a]]+score[a]);
            }
        }
        System.out.println(num2[totalTime]);
    }
    private static int getScore(int[] score, int[] time, int totalTime, int size) {
        int[] num = new int[totalTime+10];
        for(int a = 0;a<size;a++){
            for(int b = totalTime;b-time[a]>=0;b--){
                num[b] = Math.max(num[b],num[b-time[a]]+score[a]);
            }
        }
        return num[totalTime];
    }
}

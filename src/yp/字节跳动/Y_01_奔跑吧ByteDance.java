package yp.字节跳动;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

import java.util.Arrays;

/**
 * @AUTHOR : rickyin
 * @DATE : 2019-07-07 下午2:04
 */
public class Y_01_奔跑吧ByteDance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //每组派出的学生人数
        int x = sc.nextInt();

        //一组每组每个人的跑步速度
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        new ArrayList<>();
        new String();
        


        int[] y = new int[x];
        for (int i = 0; i < x; i++) {
            arr.add(sc.nextInt());
            y[i] = arr.get(i);
        }

        //另外一组跑步速度
        int[] z = new int[x];
        for (int i = 0; i < x; i++) {
            arr2.add(sc.nextInt());
            z[i] = arr2.get(i);
        }
/*       int x = 5;
        int[] y = {4,5,7,8,10};
        int[] z = {1,2,3,5,6};*/

        Arrays.sort(y);
        Arrays.sort(z);

        int score = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        for(;i < x;i++){
            int a = y[i];
            for(;j < x ;j++){
                int b = z[j];
                if(a>b){
                    score++;
                    continue;
                }else {
                    i = j - 1;
                    break;
                }
            }
        }

        System.out.println(score);
    }
}

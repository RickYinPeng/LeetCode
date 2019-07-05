package yp.剑指offer;

import java.util.HashMap;

/**
 * @author RickYinPeng
 * @ClassName Y_07_菲波那切数列
 * @Description
 * @date 2019/4/13/9:44
 */
public class Y_07_菲波那切数列 {
    public static void main(String[] args) {
        int fibonacci = Fibonacci(0);
        System.out.println(fibonacci);
    }

    static HashMap<Integer,Integer> map = new HashMap<>();
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        Integer result = Fibonacci(n-1)+Fibonacci(n-2);
        map.put(n,result);
        return result;
    }
}

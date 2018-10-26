package yp.itcast;

/**
 * @author RickYinPeng
 * @ClassName Reverse_Integer
 * @Description LeetCode中第7道题
 * @date 2018/10/26/10:30
 *
 * 题目名称：颠倒整数(这个搜不到)
 */
public class Reverse_Integer {

    public static void main(String[] args) {
        int x = 1534236469;
        int reverse = reverse(x);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        if(x==0){
            return 0;
        }else if(x>0){
            return reverse_int(x);
        }else if(x<0){
            return reverse_int(Math.abs(x))*(-1);
        }else{
            return 0;
        }
    }

    public static int reverse_int(int x){
        long rev = 0;
        long temp;
        while (x!=0){
            int pop = x % 10;
            x /= 10;

            temp = rev * 10 + pop;
            rev =temp;
        }

        if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE){
            return 0;
        }else{
            return (int) rev;
        }

    }
}

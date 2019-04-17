package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_12_数值的整数次方
 * @Description
 * @date 2019/4/17/18:44
 */
public class Y_12_数值的整数次方 {
    public static void main(String[] args) {
        Power_2(2,-3);
    }

    /**
     * 自己的做法
     * @param base
     * @param exponent
     * @return
     */
    public static double Power(double base, int exponent) {
        double inde = base;
        if(exponent>0){
            for(int i = 1;i<exponent;i++){
                base *= inde;
            }
        }else if (exponent<0){
            for(int i = 1;i<-exponent;i++){
                base *= inde;
            }
            base = 1/base;
        }else {
            return 1;
        }
        return base;
    }

    /**
     * 乘法快速幂
     */
    public static double Power_2(double base, int exponent) {
        double pow = 1;

        if(exponent>0) {
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    pow *= base;
                }
                base *= base;
                exponent /= 2;
            }
        }else if (exponent<0){
            exponent = -exponent;
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    pow *= base;
                }
                base *= base;
                exponent /= 2;
            }
            pow = 1/pow;
        }else {
            return 1;
        }
        return pow;
    }


}

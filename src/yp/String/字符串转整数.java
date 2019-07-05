package yp.String;

import org.junit.Test;

/**
 * @author RickYinPeng
 * @ClassName 字符串转整数
 * @Description LeetCode中第8道题
 * @date 2018/11/1/21:14
 */
public class 字符串转整数 {

    public static void main(String[] args) {
        String str = "   +w12312";
        int i = myAtoi_2(str);
        System.out.println(i);
    }
    public static int myAtoi(String str) {
        boolean flag = true;
        if(str.trim().equals("") || str==null){
            return 0;
        }
        int i = 0;
        char c = str.charAt(i);
        while(c==' '){
            i++;
            c = str.charAt(i);
        }
        //到达非空字符串
        if(i<str.length()){
            //如果第一个字符不是一个有效的整数
            if(!Character.isDigit(c) && c!='+' && c!='-'){
                return 0;
            }
            //是数字或者加减号
            if(Character.isDigit(c)){
                String s = String.valueOf(c);

                i++;
                if(i<str.length()){
                    c = str.charAt(i);
                }

                while(Character.isDigit(c) && i<str.length()){
                    s += c;
                    i++;
                    if(i<str.length()){
                        c = str.charAt(i);
                    }else{
                        break;
                    }
                }

                Long aLong = null;
                try {
                    aLong = Long.valueOf(s);
                } catch (NumberFormatException e) {
                    return Integer.MAX_VALUE;
                }

                if (aLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (aLong < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                int result = aLong.intValue();
                return result;
            }else{
                if(c=='-'){
                    flag = false;
                }
                String s = String.valueOf(c);
                i++;

                if(i<str.length()){
                    if(str.charAt(i)>'9' || str.charAt(i)<'0'){
                        return 0;
                    }

                    /*while (str.charAt(i)=='0'){
                        i++;
                    }*/

                    if(i<str.length()){
                        String x = str.substring(i);

                        x = x.replaceAll("[^\\d]"," ");

                        int index = 0;
                        int length = 0;
                        String[] split = x.split(" ");
                        /*int j;
                        for (j= 0;j<split.length;j++){
                            //System.out.println(split[j]);
                            if(split[j].length()>length){
                                length = split[j].length();
                                index = j;
                            }
                        }*/
                        s +=split[0];

                        Long aLong = null;
                        try {
                            aLong = Long.valueOf(s);
                        } catch (NumberFormatException e) {
                            //return 0;
                            if(flag){
                                return Integer.MAX_VALUE;
                            }else{
                                return Integer.MIN_VALUE;
                            }

                        }

                        if (aLong > Integer.MAX_VALUE) {
                            return Integer.MAX_VALUE;
                        }
                        if (aLong < Integer.MIN_VALUE) {
                            return Integer.MIN_VALUE;
                        }
                        int result = aLong.intValue();
                        return result;
                    }else{
                        return 0;
                    }

                }else{
                    return 0;
                }


            }
        }
        return 0;
    }

    public static int myAtoi_2(String str) {
        // 合法性判断
        if (str.isEmpty()) return 0;
        if(str.trim().equals("") || str==null){
            return 0;
        }
        // 正负号标记
        int sign = 1;

        // 转换值
        int base = 0;

        // 索引位数
        int i = 0;

        // 剔除开始空白字符
        while (str.charAt(i) == ' ')
            i++;

        // 判断正负号
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;

        // 索引有效数字字符
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            // that statement is used to test if the num is bigger than INT_MAX after the str[i] is handled, if base > INT_MAX/10,
            // then base10+ str[i] -‘0’> base10>INT_MAX, or when base== INT_MAX/10, that means all the places are the same as INT_MAX except the ones place, so str[i]>‘7’ is needed.
            // 上面这段是LeetCode国外站对下面代码的解释。
            // 简单来说就是
            // 如果`base > MAX_VALUE/10`，那么`base*10 + new_value` > `base*10` > `MAX_VALUE`。这个应该很容易理解，这种情况下就会发生溢出。
            // 若`base == INT_MAX/10`，而且`new_value = str.charAt(i++) - '0'`大于`7`，也会发生溢出。因为`MAX_VALUE = 2147483647`
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // 计算转换值
            base = 10 * base + (str.charAt(i++) - '0');
        }

        // 计算结果值
        return base * sign;
    }

    @Test
    public void test(){
        String s = "  +ad123123";
        s = s.replaceAll(" ","");
        s = s.replaceAll("[^\\d+-]","");
        System.out.println("s:"+s);
        String[] ss = {"adssa","dasd","dasd","dasda"};
    }
}

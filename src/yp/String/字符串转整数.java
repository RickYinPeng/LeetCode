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
        String str = "-9223372036854775809";
        int i = myAtoi(str);
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

    /*public static int myAtoi(String str) {
        String s;
        s = str.replaceAll(" ", "");
        s = s.replaceAll("[^\\d+-]", "");

        Long aLong = Long.valueOf(s);
        if (aLong > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (aLong < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int i = aLong.intValue();

        return i;
    }*/

    @Test
    public void test(){
        String s = "  +ad123123";
        s = s.replaceAll(" ","");
        s = s.replaceAll("[^\\d+-]","");
        System.out.println("s:"+s);


        String[] ss = {"adssa","dasd","dasd","dasda"};
    }
}

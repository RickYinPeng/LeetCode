package yp.String;

/**
 * @author RickYinPeng
 * @ClassName 验证回文串
 * @Description LeetCode中第125道题
 * @date 2018/10/31/18:24
 */
public class 验证回文串 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        //去除空格
        s = s.replaceAll(" ","");
        //去除其它字符
        s = s.replaceAll("[^\\da-zA-Z]","");

        //System.out.println("s:"+s);

        StringBuilder stringBuilder = new StringBuilder(s);
        //System.out.println("stringBuilder:"+stringBuilder);

        StringBuilder reverse = stringBuilder.reverse();
        //System.out.println("reverse:"+reverse);

        String toString = reverse.toString();
        //System.out.println("toString:"+toString);

        if(s.equalsIgnoreCase(toString)){
            return true;
        }
        return false;
    }

    public boolean isPalindrome_2(String s) {
        if(s==null||s.length()==0) {
            return true;
        }
        char[] numbers=s.toCharArray();   //转换为字符数组

        //大写字母转换为小写
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]>='A'&&numbers[i]<='Z') {
                numbers[i]+=32;
            }
        }
        for(int start=0,end=numbers.length-1;start<end;) {
            if(numbers[start]!=numbers[end]) {
                //首先判断是否为其它字符
                if((numbers[start]<'a'||numbers[start]>'z')&&(numbers[start]<'0'||numbers[start]>'9')) {   //开头不是字母和数字
                    ++start;
                }else if((numbers[end]<'a'||numbers[end]>'z')&&(numbers[end]<'0'||numbers[end]>'9')) {  //结尾不是字母和数字
                    --end;
                }else {
                    return false;
                }
            }else {
                ++start;
                --end;
            }
        }
        return true;
    }

}

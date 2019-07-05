package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_02_替换空格
 * @Description
 * @date 2019/4/3/13:40
 */
public class Y_02_替换空格 {
    public static void main(String[] args) {

    }
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String replace =string.replaceAll(" ","%20");

        return replace;
    }

}
